package com.example.currencydemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.currencydemo.ui.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppView()
        }
    }

    @Preview(showBackground = true, widthDp = 360, heightDp = 800)
    @Composable
    fun AppView() {
        Navigation(this)
    }
}

