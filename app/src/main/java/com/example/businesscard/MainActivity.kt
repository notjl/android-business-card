package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF073042))
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(120.dp)
                .width(160.dp)
        )
        Text(
            text = "notjl",
            color = Color.White,
            fontSize = 32.sp,
            modifier = modifier
        )
        Text(
            text = "Computer Engineer",
            color = Color(0xFF3CD380),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 3.dp)
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 35.dp)
    ) {
        HorizontalDivider(thickness = 2.dp)
        RowInfo(Icons.Rounded.Phone, "+ 63 976  - - - -  - - -")
        HorizontalDivider(thickness = 2.dp)
        RowInfo(Icons.Rounded.Email, "njl.takode@gmail.com")
        HorizontalDivider(thickness = 2.dp)
        RowInfo(Icons.Rounded.Share, "@notjl")
    }
}

@Composable
fun RowInfo(icon: ImageVector, text: String) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Spacer(
            modifier = Modifier
                .weight(2f)
        )
        Icon(
            icon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .weight(1f)
        )
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier
                .weight(5f)
                .padding(top = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}
