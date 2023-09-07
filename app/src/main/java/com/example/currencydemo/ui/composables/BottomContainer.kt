package com.example.currencydemo.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.currencydemo.R
import com.example.currencydemo.ui.theme.DateTimeColor
import com.example.currencydemo.utilities.HOME_SCREEN

@Composable
fun BottomContainer(modifier: Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .padding(18.dp)
    ) {
        val (reload, time, currentCurrencyCalculate) = createRefs()
        Image(
            painter = painterResource(R.drawable.ic_reload),
            contentDescription = "backButton",
            modifier = Modifier
                .constrainAs(reload) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start, margin = 10.dp)
                    bottom.linkTo(parent.bottom)
                    centerVerticallyTo(parent)
                }
                .clickable {

                })

        Column(modifier = modifier.constrainAs(time) {
            centerTo(parent)
        }) {
            Text(
                text = "9/5/23 2:02 PM",
                color = DateTimeColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Text(
                text = "1 USD = 306.72 PKR",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}