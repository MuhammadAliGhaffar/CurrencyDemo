package com.example.currencydemo.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.currencydemo.ui.composables.BoxWithEqualWidth
import com.example.currencydemo.ui.composables.CurrencyContainer
import com.example.currencydemo.ui.theme.Bg
import com.example.currencydemo.ui.theme.BorderStrokeColor
import com.example.currencydemo.ui.theme.DividerColor
import com.example.currencydemo.ui.theme.InnerContainerColor
import com.example.currencydemo.ui.theme.RightContainerColor
import com.example.currencydemo.ui.theme.TopContainerColor
import com.example.currencydemo.ui.theme.boxWidth
import com.example.currencydemo.ui.theme.dividerHeight
import com.example.currencydemo.utilities.CURRENCY_SCREEN

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(color = Bg)) {
        CurrencyContainer {
            Log.d("AliTag", "T1")
            navController.navigate(CURRENCY_SCREEN)
        }
        Divider(
            color = DividerColor,
            modifier = Modifier
                .height(dividerHeight)
                .fillMaxWidth()
        )
        CurrencyContainer {
            Log.d("AliTag", "T2")
            navController.navigate(CURRENCY_SCREEN)
        }
//        Spacer(modifier = Modifier)
//        First Row
        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "C",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = TopContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = TopContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "2",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = TopContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "3",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = RightContainerColor)
                    .padding(vertical = 25.dp)
            )
        }
//        Second Row
        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "5",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "6",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "7",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "8",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = RightContainerColor)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "9",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "10",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "11",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "12",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = RightContainerColor)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "13",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "14",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "15",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "16",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = RightContainerColor)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "17",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "18",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "19",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = InnerContainerColor)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "20",
                modifier = Modifier
                    .weight(1f)
                    .border(boxWidth, BorderStrokeColor)
                    .background(color = RightContainerColor)
                    .padding(vertical = 25.dp)
            )
        }


    }
}