package com.example.currencydemo.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.currencydemo.ui.composables.BottomContainer
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
import com.example.currencydemo.utilities.Utils.toast

@Composable
fun HomeScreen(navController: NavController) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Bg)
    ) {
        val (firstCurrencyContainer, secondCurrencyContainer, divider, middleContainer, bottomContainer) = createRefs()

        CurrencyContainer(modifier = Modifier.constrainAs(firstCurrencyContainer) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
        }, onClick = {
            Log.d("AliTag", "T1")
            navController.navigate(CURRENCY_SCREEN)
        })
        Divider(
            color = DividerColor,
            modifier = Modifier
                .height(dividerHeight)
                .fillMaxWidth()
                .constrainAs(divider) {
                    top.linkTo(firstCurrencyContainer.bottom)
                }
        )
        CurrencyContainer(modifier = Modifier.constrainAs(secondCurrencyContainer) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(divider.bottom)
        }, onClick = {
            Log.d("AliTag", "T2")
            navController.navigate(CURRENCY_SCREEN)
        })

//        Spacer(modifier = Modifier)
//        First Row
        Column(modifier = Modifier
            .fillMaxWidth()
            .constrainAs(bottomContainer) {
                bottom.linkTo(parent.bottom)
            }) {
            Row(modifier = Modifier.fillMaxWidth()) {
                BoxWithEqualWidth(
                    value = "c",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "c Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = TopContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "←",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "← Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = TopContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "⇅",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "⇅ Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = TopContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "÷",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "÷ Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = RightContainerColor)
                        .padding(vertical = 25.dp)
                )
            }
//        Second Row
            Row(modifier = Modifier.fillMaxWidth()) {
                BoxWithEqualWidth(
                    value = "7",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "7 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "8",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "8 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "9",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "9 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "×",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "× Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = RightContainerColor)
                        .padding(vertical = 25.dp)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                BoxWithEqualWidth(
                    value = "4",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "4 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "5",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "5 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "6",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "6 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "-",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "- Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = RightContainerColor)
                        .padding(vertical = 25.dp)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                BoxWithEqualWidth(
                    value = "1",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "1 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "2",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "2 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "3",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "3 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "+",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "+ Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = RightContainerColor)
                        .padding(vertical = 25.dp)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                BoxWithEqualWidth(
                    value = "0",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "0 Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = ".",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, ". Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "%",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "% Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = InnerContainerColor)
                        .padding(vertical = 25.dp)
                )
                BoxWithEqualWidth(
                    value = "=",
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            toast(navController.context, "= Click")
                        }
                        .border(boxWidth, BorderStrokeColor)
                        .background(color = RightContainerColor)
                        .padding(vertical = 25.dp)
                        ,

                    )
            }

            BottomContainer(modifier = Modifier, onClick = {
                toast(navController.context, "BottomContainer Click")
            })
        }

    }
}