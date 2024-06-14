package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                BusinessCardScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier.fillMaxSize()) {
    Column(
        modifier = modifier
//            .border(1.dp, color = Color.Red)
//            .padding(16.dp)
            .background(Color(0xffdae5db))
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.weight(3F)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Display Picture",
                modifier = Modifier
                    .size(145.dp)
                    .background(Color(0xff182c35))
//                    .padding(0.dp,0.dp,0.dp,0.dp,)
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 50.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 18.sp,
                color = Color(0xff2e6148),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.weight(1F)
        ) {
            Column (
                modifier = Modifier.height(110.dp),
                verticalArrangement = Arrangement.SpaceBetween

            ){
                Row(
                    modifier = Modifier
                ) {
                    Icon(
                        Icons.Filled.Phone,
                        contentDescription = "Phone Number",
                        tint = Color(0xff2e6148)
                    )
                    Text(
                        text = "+11 (123) 444 555 666",
                        fontSize = 18.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp)
                    )

                }
                Row(
                    modifier = Modifier
                ) {
                    Icon(
                        Icons.Filled.Share,
                        contentDescription = "Phone Number",
                        tint = Color(0xff2e6148)
                    )
                    Text(
                        text = "@AndroidDev",
                        fontSize = 18.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp)
                    )

                }
                Row(
                    modifier = Modifier
                ) {
                    Icon(
                        Icons.Filled.Email,
                        contentDescription = "Phone Number",
                        tint = Color(0xff2e6148)
                    )
                    Text(
                        text = "jen.doe@android.com",
                        fontSize = 18.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp)
                    )

                }
            }
        }
    }
}