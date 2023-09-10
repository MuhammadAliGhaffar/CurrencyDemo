package com.example.currencydemo.data.api

import com.example.currencydemo.data.model.ApiParams
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiDialer: DialerApi) {

    suspend fun getCurrencies(accessKey: String) =
        apiDialer.getCurrencies(ApiParams.getCurrenciesParams(accessKey = accessKey))

}