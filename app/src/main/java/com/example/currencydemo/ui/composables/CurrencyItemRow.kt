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
import com.example.currencydemo.data.model.Currency

@Composable
fun CurrencyItemRow(
    countryImageValue: Int = (R.drawable.ic_rounded_us),
    countryNameValue: String = "US Dollar",
    currencyCodeValue: String = "USD",
    onClick: (currency:Currency) -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick(Currency(countryImageValue, countryNameValue, currencyCodeValue)) }
//        .background(color = Color.LightGray)
//            .border(width = 0.5.dp, color = Color.Gray)
            .padding(18.dp)
    ) {
        val (countryName, countryImage, currencyCode) = createRefs()
        Image(
            painter = painterResource(countryImageValue),
            contentDescription = "country",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(1.dp, Color.White, CircleShape)
                .constrainAs(countryImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                }   // add a border (optional)

        )

        Text(
            text = countryNameValue,
            color = Color.White,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.constrainAs(countryName) {
                start.linkTo(countryImage.end, margin = 15.dp)
                centerVerticallyTo(countryImage)
            })


        Text(text = currencyCodeValue,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            modifier = Modifier
                .constrainAs(currencyCode) {
                    end.linkTo(parent.end)
                    centerVerticallyTo(parent)
                })
    }
}