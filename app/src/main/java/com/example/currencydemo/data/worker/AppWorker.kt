package com.example.currencydemo.data.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.currencydemo.R
import com.example.currencydemo.data.repository.Repository
import com.example.currencydemo.data.utilities.NetworkResult
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
    private val repository: Repository
) : CoroutineWorker(appContext, workerParams) {
    override suspend fun doWork(): Result {
        withContext(Dispatchers.IO) {
            repository.getCurrencies(applicationContext.getString(R.string.api_key)).onEach {
                when (it) {
                    is NetworkResult.Success -> {

//                        repository.allDatabaseUsers().userDao().insertUser(it)
                        toast(applicationContext,"${it.data}")
                        Log.d("_debug", "Worker Called - Updated list added in Database ${it.data}")
                    }
                    else -> {}
                }
            }.collect()
        }
        return Result.failure()
    }
}
