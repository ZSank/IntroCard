package com.sankapp.introcard

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LifecycleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: ")
        enableEdgeToEdge()
        setContent {
            TestLifecycle()
        }
    }
    val tag = "lifecycle"
    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart:")

    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy: ")
    }
}


@Composable
fun TestLifecycle(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Hello from Lifecycle Activity", modifier = modifier.padding(40.dp), fontSize = 40.sp)
    }
}
