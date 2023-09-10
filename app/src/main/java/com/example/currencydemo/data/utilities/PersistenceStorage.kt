package com.example.currencydemo.data.utilities

import android.content.Context
import android.content.SharedPreferences
import com.example.currencydemo.R
import com.example.currencydemo.data.model.CurrencyResponse
import com.google.gson.Gson
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

class PersistenceStorage @Inject constructor(
    private val context: Context,
    private val gson: Gson
) {

    private val sharedPref: SharedPreferences = context.getSharedPreferences(
        context.getString(R.string.app_name) + "-persistence",
        Context.MODE_PRIVATE
    )
    private val editor = sharedPref.edit()

    fun clearPref() {
        editor.clear().commit()
    }

    fun setCurrencies(currencyResponse: CurrencyResponse?) {
        editor.putString(CURRENCY_RESPONSE, gson.toJson(currencyResponse))
    }

    fun getCurrencies(): CurrencyResponse {
        return gson.fromJson(
            sharedPref.getString(CURRENCY_RESPONSE, gson.toJson(CurrencyResponse())),
            CurrencyResponse::class.java
        )
    }
}