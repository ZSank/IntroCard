package com.sankapp.introcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sankapp.introcard.contact.ContactListScreen
import com.sankapp.introcard.ui.theme.IntroCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactListScreen()
//            LoginScreen()
//            IntroCardWithButton()
//            MyNameWithImage()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyName() {
    Column {
        Text(text = "John Doe",
            modifier = Modifier.padding(top = 50.dp).fillMaxWidth(),
            fontSize = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(text = "Android Developer",
            modifier = Modifier.padding(20.dp).padding(top = 40.dp),
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
fun MyNameInRow() {
    Row {
        Text(text = "John Doe",
            modifier = Modifier.padding(top = 40.dp),
            fontSize = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(text = "  12345",
            modifier = Modifier.padding(top = 40.dp),
            fontSize = 40.sp
        )
        Text(text = " 77",
            modifier = Modifier.padding(top = 40.dp),
            fontSize = 40.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TestColumn() {
    Column {
        Text("Hello")
        Text("World")
        Text("World")
        Text("World")
        Text("World")
        Text("World")
        Text("World")
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntroCardTheme {
        Greeting("Android")
    }
}