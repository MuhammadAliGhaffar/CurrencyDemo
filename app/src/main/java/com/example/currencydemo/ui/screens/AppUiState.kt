package com.example.currencydemo.ui.screens

import com.example.currencydemo.data.model.CurrencyResponse

/**
 * Data class that represents the app UI state
 */
data class AppUiState(
    var internetIsConnected: Boolean = false,
    var currencyResponse: CurrencyResponse = CurrencyResponse()
)