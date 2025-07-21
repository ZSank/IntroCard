package com.sankapp.introcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyNameWithImage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(R.drawable.person_introcard),
            contentDescription = "this is my image",
            alpha = 0.8F,
        )
        Text(text = "John Doe",
            modifier = Modifier.padding(top = 50.dp),
            fontSize = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(text = "Android Developer",
            modifier = Modifier
                .padding(20.dp)
                .padding(top = 40.dp),
            fontSize = 20.sp,
        )
        Text(text = "9988117788",
            modifier = Modifier.padding(20.dp),
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TestingRow(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.padding(top = 40.dp).fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Text("One", fontSize = 40.sp)
        Text("One", fontSize = 40.sp)
        Text("One", fontSize = 40.sp)
        Text("One", fontSize = 40.sp)
    }
}