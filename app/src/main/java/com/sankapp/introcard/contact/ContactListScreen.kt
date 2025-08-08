package com.sankapp.introcard.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sankapp.introcard.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactListScreen(modifier: Modifier = Modifier) {
    val contactNameSize = contactName.size
    LazyColumn(modifier.padding(top = 25.dp)) {
        items(contactNameSize) { index ->
            ContactItem(numb = index, name = contactName[index], phoneNumber = index * 17)
        }
    }
}

val contactName = listOf(
    "Ram",
    "Tam",
    "Gam",
    "Jam",
    "Uam",
    "Kam",
    "Lama",
    "Uam",
    "Rdfam",
    "Tsdfam",
    "Gadm",
    "Jadm",
    "Ufam",
    "Kafm",
    "Lasma",
    "Ufam",
)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactItem(
    modifier: Modifier = Modifier,
    numb: Int = 0,
    phoneNumber: Int = 123,
    name: String = ""
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp), // Added padding for spacing
        verticalAlignment = Alignment.CenterVertically // Vertically center the items
    ) {
        // Profile Image with circular shape
        Image(
            painter = painterResource(R.drawable.person_introcard),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(1.dp, MaterialTheme.colorScheme.onSurfaceVariant, CircleShape) // Border
        )

        Spacer(modifier = Modifier.width(30.dp)) // Space between image and text

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp) // Space between text items
        ) {
            Text(
                text = "Sr no.$numb",
                fontStyle = FontStyle.Italic,
                fontSize = 18.sp
            )
            Text(
                text = "Name: $name",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Number: $phoneNumber",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
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
    }
}