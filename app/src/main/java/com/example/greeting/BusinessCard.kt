package com.example.greeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.greeting.ui.theme.HappyBirthdayTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeMain(name = "Jennifer Doe", jobTitle = "Android Developer Extraordinaire", modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun ComposeMain(name: String, jobTitle: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = name,
        )
        Text(
            text = jobTitle,
            color = Color.Green,
            fontWeight = FontWeight.Bold,
        )
    }
    Column {

    }
}

@Composable
private fun ComposeFooter() {
    Row {
        Column {
            Text(
                text = "+11 (123) 444 555 666"
            )
            Text(
                text = "@AndroidDev"
            )
            Text(
                text = "jen.doe@android.com"
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    HappyBirthdayTheme {
        ComposeMain(name = "Jennifer Doe", jobTitle = "Android Developer Extraordinaire", modifier = Modifier.fillMaxSize())
    }
}