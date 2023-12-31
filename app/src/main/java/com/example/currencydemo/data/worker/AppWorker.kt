package com.example.currencydemo.data.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.currencydemo.R
import com.example.currencydemo.data.repository.Repository
import com.example.currencydemo.data.utilities.API_KEY
import com.example.currencydemo.data.utilities.NetworkResult
import com.example.currencydemo.data.utilities.PersistenceStorage
import com.example.currencydemo.data.utilities.Utils.toast
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.withContext

@HiltWorker
class AppWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val repository: Repository,
    private val persistenceStorage: PersistenceStorage
) : CoroutineWorker(appContext, workerParams) {
    override suspend fun doWork(): Result {
        withContext(Dispatchers.IO) {
            repository.getCurrencies(API_KEY).onEach {
                when (it) {
                    is NetworkResult.Success -> {
                        persistenceStorage.setCurrencies(it.data)
                        Log.d("_debug", "Worker Called - Updated data added in pref ${it.data}")
                    }
                    else -> {}
                }
            }.collect()
        }
        return Result.failure()
    }
}
