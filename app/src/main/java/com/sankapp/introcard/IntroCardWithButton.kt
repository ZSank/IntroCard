package com.sankapp.introcard

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showSystemUi = true)
@Composable
fun IntroCardWithButton() {
//    simple variable, won't work with composable
//    var count: Int = 0

//    Cannot survive configuration changes like screen rotation
//    var count by remember { mutableStateOf(-1) }

//    Best way to declare state. Survives configuration changes.
    var count by rememberSaveable { mutableStateOf(-1) }


    Column(
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "count is: $count",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp
        )

        Button(onClick = { count += 1 }) {
            Text("Increment")
        }

        Button(
            onClick = { printMyValue() },
            modifier = Modifier.padding(top = 50.dp, start = 20.dp)
        ) {
            Text("Click me for printing")
        }
    }
}


private const val IntroCardButton = "IntroCardButton"

fun printMyValue() {
    println(" printMyValue")
    Log.d(IntroCardButton, "printlnMyValueLog")
}


