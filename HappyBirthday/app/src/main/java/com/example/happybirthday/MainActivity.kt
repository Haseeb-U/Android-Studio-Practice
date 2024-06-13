package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.signature_text)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(from : String, message: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceAround,
//        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,

        )
        Text(
            text = "From $from",
            fontSize = 36.sp,
            //lineHeight = 116.sp
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),
            color = Color.Black

        )
    }
}

@Composable
fun GreetingImage(from : String, message: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.androidparty)
    Box (modifier = modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            alpha = 0.7F,
            modifier = Modifier.fillMaxSize()
        )
        GreetingText(from = from, message = message, modifier = Modifier
            .fillMaxSize()
            .padding(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = Color.Black
//        ) {
            GreetingImage(
                message = stringResource(R.string.happy_birthday_text),
                from = stringResource(R.string.signature_text),
//                modifier = Modifier.padding(8.dp)
            )

//        }
    }
}