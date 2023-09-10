package com.example.currencydemo.data.model

object ApiParams {
    fun getCurrenciesParams(accessKey: String): HashMap<String, Any> {
        val params: HashMap<String, Any> = HashMap()
        params["access_key"] = accessKey
        return params
    }
}