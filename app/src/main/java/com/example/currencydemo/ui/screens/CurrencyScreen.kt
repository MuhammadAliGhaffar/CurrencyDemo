package com.example.currencydemo.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.currencydemo.R
import com.example.currencydemo.data.utilities.Utils.toast
import com.example.currencydemo.ui.composables.CurrencyItemRow
import com.example.currencydemo.ui.theme.Bg
import com.example.currencydemo.ui.theme.DividerColor
import com.example.currencydemo.ui.theme.dividerHeight

@Composable
fun CurrencyScreen(
    navController: NavController,
    mainViewModel: MainViewModel = hiltViewModel()
) {
    val uiState = mainViewModel.uiState.collectAsState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Bg)
    ) {

        Row(modifier = Modifier.weight(0.1f)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                    val (backButton, textTitle) = createRefs()
                    Image(
                        painter = painterResource(R.drawable.ic_back),
                        contentDescription = "backButton",
                        modifier = Modifier
                            .constrainAs(backButton) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start, margin = 10.dp)
                                bottom.linkTo(parent.bottom)
                                centerVerticallyTo(parent)
                            }
                            .clickable {
                                navController.navigateUp()
                            })
                    Text(
                        text = "Currencies",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.constrainAs(textTitle) {
                            centerTo(parent)
                        })
                }

            }
        }
        Divider(
            color = DividerColor,
            modifier = Modifier
                .height(dividerHeight)
                .fillMaxWidth()
        )

        LazyColumn(modifier = Modifier.weight(0.9f), content = {
            uiState.value.currencyResponse.rates?.let {
                items(it.getCurrenciesRates()) { item ->
                    CurrencyItemRow(
                        item.countryImageValue,
                        item.countryNameValue,
                        item.currencyCodeValue
                    ) {
                        toast(navController.context, it.countryNameValue)
                    }
                }
            }
        })
    }


}