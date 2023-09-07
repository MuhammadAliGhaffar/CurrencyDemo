package com.example.currencydemo.ui.screens

import android.util.Log
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.currencydemo.R
import com.example.currencydemo.data.model.Currency
import com.example.currencydemo.ui.composables.CurrencyItemRow
import com.example.currencydemo.ui.theme.Bg
import com.example.currencydemo.ui.theme.DividerColor
import com.example.currencydemo.ui.theme.dividerHeight

@Composable
fun CurrencyScreen(navController: NavController) {
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
            items(getList()) { item ->
                CurrencyItemRow(
                    item.countryImageValue,
                    item.countryNameValue,
                    item.currencyCodeValue
                ) {
                    Log.d("AliTag", it.countryNameValue)
                }
            }
        })
    }


}

fun getList(): List<Currency> {
    return listOf(
        Currency(R.drawable.ic_rounded_us, "US Dollar1", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar2", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar3", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar4", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar5", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar6", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar7", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar8", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar9", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar10", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar7", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar8", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar9", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar10", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar", "USD"),
        Currency(R.drawable.ic_rounded_us, "US Dollar", "USD"),
    )
}