package com.example.currencydemo.ui


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.currencydemo.R
import com.example.currencydemo.ui.theme.Orange
import com.example.currencydemo.utilities.CURRENCY_SCREEN
import com.example.currencydemo.utilities.HOME_SCREEN

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HOME_SCREEN) {
        composable(route = HOME_SCREEN) {
            HomeScreen(navController)
        }
        composable(route = CURRENCY_SCREEN) {
            CurrencyScreen()
        }
    }
}

@Composable
fun CurrencyScreen() {
    Text(text = "CurrencyScreen")
}

@Composable
fun currencyContainer(onClick: () -> Unit) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
//        .background(color = Color.LightGray)
//            .border(width = 0.5.dp, color = Color.Gray)
            .padding(16.dp)
            .clickable { onClick() }
    ) {
        val (countryCode, countryImage, amount) = createRefs()
        Image(
            painter = painterResource(R.drawable.ic_rounded_us),
            contentDescription = "country",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(2.dp, Color.Gray, CircleShape)
                .constrainAs(countryImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }   // add a border (optional)
        )

        Text(
            text = "USD",
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.constrainAs(countryCode) {
                top.linkTo(countryImage.bottom, margin = 5.dp)
                centerHorizontallyTo(countryImage)
            })


        Text(text = "1000".toFloat().toString(),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .constrainAs(amount) {
                    end.linkTo(parent.end)
                    centerVerticallyTo(parent)
                })
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        currencyContainer {
            Log.d("AliTag", "T1")
            navController.navigate(CURRENCY_SCREEN)
        }
        Divider(
            color = Color.Gray,
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
        )
        currencyContainer {
            Log.d("AliTag", "T2")
            navController.navigate(CURRENCY_SCREEN)
        }
//        Spacer(modifier = Modifier)
        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "C",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Orange)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "C",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Orange)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "C",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Orange)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "C",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Orange)
                    .padding(vertical = 25.dp)
            )
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            BoxWithEqualWidth(
                value = "C",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Color.DarkGray)
                    .padding(vertical = 25.dp)
            )
            BoxWithEqualWidth(
                value = "1",
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray)
                    .background(color = Orange)
                    .padding(vertical = 25.dp)
            )
        }


    }
}


//-----------
@Composable
fun BoxWithEqualWidth(
    value:String,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
    ) {
        Text(text = value,fontSize = 20.sp, fontWeight = FontWeight.Bold , color = Color.White, modifier = Modifier.align(Alignment.Center))
    }
}