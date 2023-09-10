package com.example.currencydemo.ui.screens

import com.example.currencydemo.data.model.Currency

/**
 * Data class that represents the app UI state
 */
data class AppUiState(
    var internetIsConnected: Boolean = false,
    var currencyList: ArrayList<Currency> = arrayListOf()
)