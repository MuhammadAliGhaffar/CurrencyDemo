package com.example.currencydemo.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.currencydemo.R

@Composable
fun CurrencyContainer(onClick: () -> Unit) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
//        .background(color = Color.LightGray)
//            .border(width = 0.5.dp, color = Color.Gray)
            .padding(horizontal = 18.dp, vertical = 25.dp)
    ) {
        val (countryCode, countryImage, amount) = createRefs()
        Image(
            painter = painterResource(R.drawable.ic_rounded_us),
            contentDescription = "country",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(1.dp, Color.White, CircleShape)
                .constrainAs(countryImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }   // add a border (optional)
        )

        Text(
            text = "USD",
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.constrainAs(countryCode) {
                top.linkTo(countryImage.bottom, margin = 5.dp)
                centerHorizontallyTo(countryImage)
            })


        Text(text = "1000".toFloat().toString(),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
                .constrainAs(amount) {
                    end.linkTo(parent.end)
                    centerVerticallyTo(parent)
                })
    }
}