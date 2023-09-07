package com.example.currencydemo.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun BoxWithEqualWidth(
    value:String,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
    ) {
        Text(text = value,fontSize = 25.sp, fontWeight = FontWeight(300) , color = Color.White, modifier = Modifier.align(
            Alignment.Center))
    }
}