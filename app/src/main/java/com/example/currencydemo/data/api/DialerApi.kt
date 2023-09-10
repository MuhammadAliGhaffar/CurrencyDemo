package com.example.currencydemo.data.api

import com.example.currencydemo.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

const val BASE_URL = "https://api.exchangeratesapi.io/"
const val URL_CURRENCIES = "v1/latest"
interface DialerApi {

    @GET(URL_CURRENCIES)
    suspend fun getCurrencies(
        @QueryMap params: HashMap<String, Any>
    ): Response<CurrencyResponse>
}