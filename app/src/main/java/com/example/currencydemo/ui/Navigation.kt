package com.example.currencydemo.ui


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.currencydemo.data.utilities.CURRENCY_SCREEN
import com.example.currencydemo.data.utilities.HOME_SCREEN
import com.example.currencydemo.ui.screens.CurrencyScreen
import com.example.currencydemo.ui.screens.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HOME_SCREEN) {
        composable(route = HOME_SCREEN) {
            HomeScreen(navController = navController)
        }
        composable(route = CURRENCY_SCREEN) {
            CurrencyScreen(navController = navController)
        }
    }
}