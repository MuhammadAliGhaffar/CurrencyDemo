package com.example.currencydemo.ui


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.currencydemo.ui.screens.CurrencyScreen
import com.example.currencydemo.ui.screens.HomeScreen
import com.example.currencydemo.utilities.CURRENCY_SCREEN
import com.example.currencydemo.utilities.HOME_SCREEN

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HOME_SCREEN) {
        composable(route = HOME_SCREEN) {
            HomeScreen(navController)
        }
        composable(route = CURRENCY_SCREEN) {
            CurrencyScreen(navController)
        }
    }
}