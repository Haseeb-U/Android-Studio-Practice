package com.example.jetpackcomposearticleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposearticleapp.ui.theme.JetpackComposeArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeArticleAppTheme {
                Article(modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxSize())
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Article(modifier: Modifier = Modifier.background(Color.Cyan).fillMaxSize()){
    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
//            alpha = 0.1F
        )
    }
}
