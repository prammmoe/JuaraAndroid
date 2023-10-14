package com.example.greeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        Spacer(modifier = Modifier.padding(136.dp))
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .width(100.dp)
                .background(Color.DarkGray)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 36.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = jobTitle,
            textAlign = TextAlign.Center,
            color = Color.Green,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
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