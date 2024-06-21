package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ArtSpaceApp(
                        modifier = Modifier
                            .fillMaxSize()
                            .statusBarsPadding()
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier.fillMaxSize()) {

    var artNo by remember { mutableStateOf(0) }

    @DrawableRes val artRes = when (artNo) {
        0 -> R.drawable.ai_art_1
        1 -> R.drawable.ai_art_2
        2 -> R.drawable.ai_art_3
        3 -> R.drawable.ai_art_4
        else -> R.drawable.ai_art_5
    }
    @StringRes val artTitle = when (artNo) {
        0 -> R.string.ai_art_1
        1 -> R.string.ai_art_2
        2 -> R.string.ai_art_3
        3 -> R.string.ai_art_4
        else -> R.string.ai_art_5
    }

    Column(
        modifier = modifier
//            .background(color = Color.Blue)
/*            .verticalScroll(rememberScrollState())*/
            .safeDrawingPadding()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Surface(
//            shadowElevation = 20.dp,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier
                .weight(3.5f)
//                .fillMaxWidth()
                .width(450.dp)
                .wrapContentSize()
                .padding(vertical = 50.dp)
                .shadow(20.dp, RoundedCornerShape(20.dp), spotColor = MaterialTheme.colorScheme.primary),
        ) {
            Image(
                painter = painterResource(id = artRes),
                contentDescription = "AI Art 1",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.padding(32.dp,36.dp)
            )
        }

        Surface(
            tonalElevation = 50.dp,
//            color = MaterialTheme.colorScheme.tertiary,
            modifier = Modifier
                .weight(0.6f)
//                .fillMaxWidth()
                .wrapContentSize()
//                .padding(vertical = 50.dp),
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )) {
                        append("Title : ${stringResource(id = artTitle)}\n")
                        }
                    withStyle(
                        style = SpanStyle(
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    ){
                        append("by HSB ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            fontWeight = FontWeight.Light,
                            color = Color.Gray
                        )
                    ){
                        append("(2024)")
                    }
                },
                letterSpacing = 2.sp,
                modifier = Modifier.padding(16.dp,16.dp)
            )


            }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { artNo = if(artNo > 0) artNo-1 else 4 },
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                modifier = Modifier
                    .size(height = 50.dp, width = 130.dp)
            ) {
                Text(text = "Previous", fontSize = MaterialTheme.typography.bodyLarge.fontSize)
            }
            Button(
                onClick = { artNo = (1+artNo) % 5 },
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                modifier = Modifier
                    .size(height = 50.dp, width = 130.dp)
            ) {
                Text(text = "Next", fontSize = MaterialTheme.typography.bodyLarge.fontSize)
            }
        }

        }

    }