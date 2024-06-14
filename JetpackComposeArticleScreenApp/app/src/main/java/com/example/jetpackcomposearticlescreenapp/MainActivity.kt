package com.example.jetpackcomposearticlescreenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposearticlescreenapp.ui.theme.JetpackComposeArticleScreenAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            JetpackComposeArticleScreenAppTheme {
                Article(modifier = Modifier
//                    .background(Color.Cyan)
                    .fillMaxSize())
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Article(modifier: Modifier = Modifier.fillMaxSize()){
    val heading1 = stringResource(R.string.heading1)
    val para1 = stringResource(R.string.para1)
    val para2 = stringResource(R.string.para2)
    Column(
        modifier = modifier
    ) {


        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
//            alpha = 0.1F
        )

        Para(text = heading1, fontSize = 24, modifier = Modifier.padding(16.dp))
        Para(text = para1, fontSize = null, modifier = Modifier.padding(16.dp, 0.dp))
        Para(text = para2, fontSize = null, modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun Para(text: String, fontSize : Int?, modifier: Modifier = Modifier){
    when(fontSize){
        null -> Text(
            text = text,
            modifier = modifier,
            textAlign = TextAlign.Justify
        )
        else -> Text(
            text = text,
            fontSize = fontSize.sp,
            modifier = modifier,
            textAlign = TextAlign.Justify
        )
    }
}

