package com.sankapp.introcard

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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

@Preview()
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {


    var userId by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var result by rememberSaveable { mutableStateOf("") }

    fun validateDetails() {
        val correctId = userId == "abc"
        val correctPass = password == "123"

        if (correctId && correctPass) {
            result = "✅ Success! Welcome."
        } else {
            result = "❌ Error: Invalid Credentials."
        }
    }

    Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = result, modifier.padding(10.dp))
        OutlinedTextField(value = userId,
            onValueChange = {
                userId = it
                Log.d("mLog-LoginScreen", "LoginScreen: userId:$it")
            },
            label = { Text("Enter Name") }
        )

        OutlinedTextField(value = password,
            onValueChange = {
                password = it
                Log.d("mLog-LoginScreen", "LoginScreen: password:$it")
            },
            label = { Text("Enter Password") }
        )

        Button(
            onClick = { validateDetails() },
            modifier = modifier
                .padding(10.dp)
                .padding(bottom = 40.dp)
        ) {
            Text("Login")
        }
    }
}

