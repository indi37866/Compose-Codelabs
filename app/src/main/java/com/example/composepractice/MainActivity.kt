package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.draw.blur
import java.nio.file.WatchEvent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeTheme {
                Surface {
                    BusinessCard()
                }
            }
        }
    }
}



@Composable
fun UpperCardSide(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth().padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        )
    {
        Icon(imageVector = Icons.Filled.AccountBox, contentDescription = null,
            modifier = Modifier.size(120.dp))
        Text(modifier = Modifier.padding(top = 4.dp),
            text = "Indo",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold)
        Text(text = "Android Developer intern", fontSize = 24.sp)
    }

}

@Composable
fun LowerCardSide(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth().padding(top = 8.dp, end = 8.dp, start = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Row(modifier = Modifier.padding(12.dp)) {
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = null,
                modifier = Modifier.padding(end = 16.dp)
                )
            Text(
                text = "+00 (00) 000 000"
            )
        }
        Row(modifier = Modifier.padding(12.dp)) {
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = null,
                modifier = Modifier.padding(end = 16.dp)
                )
            Text(
                text = "t.me/indi2167"
            )
        }
        Row(modifier = Modifier.padding(12.dp)) {
            Icon(
                imageVector = Icons.Filled.MailOutline,
                contentDescription = null,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(
                text = "indi37866@gmail.com"
            )
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    )
    {
        UpperCardSide(modifier = Modifier.fillMaxSize().weight(1f))
        LowerCardSide(modifier = Modifier.padding(bottom = 32.dp))
    }
}

@Composable
@Preview(showBackground = true)
fun MainPreview(modifier: Modifier = Modifier) {
    ComposePracticeTheme() {
        BusinessCard()
    }
}


