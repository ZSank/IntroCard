package com.sankapp.introcard.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sankapp.introcard.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactListScreen(modifier: Modifier = Modifier) {
    Spacer(modifier.height(20.dp))
    Column {
        ContactItem()
        ContactItem()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactItem(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.person_introcard),
            contentDescription = ""
        )
        Column {
            Text(text = "Name")
            Text(text = "Number")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactSimpleList(modifier: Modifier = Modifier) {
    Column {
        Spacer(modifier.height(40.dp))
        /*
        repeat(10) {
            ContactItem()
        }
        */
        ContactItem()
        ContactItem()
        ContactItem()
        ContactItem()
        ContactItem()
        ContactItem()
        ContactItem()
        ContactItem()
    }
}