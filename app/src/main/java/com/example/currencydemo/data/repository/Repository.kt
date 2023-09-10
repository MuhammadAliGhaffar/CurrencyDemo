package com.example.currencydemo.data.repository

import com.example.currencydemo.data.api.RemoteDataSource
import com.example.currencydemo.data.model.BaseApiResponse
import com.example.currencydemo.data.model.CurrencyResponse
import com.example.currencydemo.data.utilities.NetworkResult
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseApiResponse() {

    suspend fun getCurrencies(accessKey: String): Flow<NetworkResult<CurrencyResponse>> {
        return flow {
            emit(safeApiCall { remoteDataSource.getCurrencies(accessKey) })
        }.flowOn(Dispatchers.IO)
    }
}

