package com.example.currencydemo.ui.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencydemo.data.model.Currency
import com.example.currencydemo.data.repository.Repository
import com.example.currencydemo.data.utilities.API_KEY
import com.example.currencydemo.data.utilities.NetworkResult
import com.example.currencydemo.data.utilities.PersistenceStorage
import com.example.currencydemo.data.utilities.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository,
    private val persistenceStorage: PersistenceStorage
) : ViewModel() {


    private val _uiState = MutableStateFlow(AppUiState())
    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()


    init {
        getCurrency()
    }

    private fun getCurrency() {
        viewModelScope.launch {
            repository.getCurrencies(API_KEY).onEach { value ->
                when (value) {
                    is NetworkResult.Success -> {
                        value.data?.let {
                            persistenceStorage.setCurrencies(it)
                            _uiState.value.currencyResponse = it
                        }
                    }

                    is NetworkResult.Loading -> {
                        Log.d("_debug", "loading")

                    }

                    is NetworkResult.Error -> {
                        if (value.message.equals("Api call failed Unable to resolve host \"api.exchangeratesapi.io\": No address associated with hostname") || !Utils.internetIsConnected())
                            persistenceStorage.getCurrencies().let {
                                _uiState.value.currencyResponse = it
                            }
                        Log.d("_debug", "error ${value.data?.success}")
                    }
                }
            }.collect()
        }
    }
}