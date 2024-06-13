package com.example.composablefunctioninfoscreenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composablefunctioninfoscreenapp.ui.theme.ComposableFunctionInfoScreenAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableFunctionInfoScreenAppTheme {
                InfoScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InfoScreen(modifier: Modifier = Modifier.fillMaxSize()) {
    Column(modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Row {
            Column(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
            }

            Column(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
            }
        }
        Row {
            Column(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
            }

            Column(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                )
            }
        }
    }
}


