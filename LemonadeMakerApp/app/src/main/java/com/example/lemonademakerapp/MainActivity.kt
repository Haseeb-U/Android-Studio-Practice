package com.example.lemonademakerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonademakerapp.ui.theme.LemonadeMakerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            LemonadeMakerAppTheme {
                LemonadeMakerApp(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White))
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LemonadeMakerApp(modifier: Modifier = Modifier
    .fillMaxSize()
    .background(Color.White)) {

    var stepCount by remember { mutableIntStateOf(0) }
    val imageResource = when (stepCount) {
        0 -> R.drawable.lemon_tree
        1 -> R.drawable.lemon_squeeze
        2 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    val contentDescriptionResource = when (stepCount) {
        0 -> stringResource(R.string.lemon_tree_content_description)
        1 -> stringResource(R.string.lemon_squeeze_content_description)
        2 -> stringResource(R.string.lemon_drink_content_description)
        else -> stringResource(R.string.lemon_restart_content_description)
    }

    Column(
        modifier = modifier
    ) {
        Text(
            text = "Lemonade",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            lineHeight = 76.sp,
            modifier = Modifier
                .background(Color(0xffebe195))
                .fillMaxWidth()
                .height(76.dp)
        )

        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { stepCount = (1+stepCount) % 4 },
                shape = RoundedCornerShape(48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xffd2e7da)),
                modifier = Modifier.size(250.dp,300.dp)
            ) {
                Image(
                    painter = painterResource(id = imageResource),
                    contentDescription = "Lemon Tree",
                    modifier = Modifier
                        .size(250.dp,250.dp)

                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = contentDescriptionResource,
                color = Color.DarkGray,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
            )
        }
    }
}