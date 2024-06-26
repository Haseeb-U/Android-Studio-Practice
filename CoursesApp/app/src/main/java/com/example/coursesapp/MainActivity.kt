package com.example.coursesapp

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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.data.TopicData
import com.example.coursesapp.data.TopicList
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    App()
                }
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier){
    ListLayout(items = TopicList.topics.sortedBy { it.name }, modifier = modifier)
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppPreview() {
    CoursesAppTheme {
        ListLayout(items = TopicList.topics.sortedBy { it.name })
    }
}

@Composable
fun ListLayout(
    items: List<TopicData>,
    modifier: Modifier = Modifier
){
    val listEvenIndices = items.filterIndexed { index, _ -> index % 2 == 0 }
    val listOddIndices = items.filterIndexed { index, _ -> index % 2 != 0 }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .statusBarsPadding()
    ){

        Column(
            modifier = Modifier
                .weight(1F)
                .padding(end = 8.dp)

        ){
            for (item in listEvenIndices){
                ItemLayout(topic = item)
            }

        }
        Column(
            modifier = Modifier
                .weight(1F)
        ){
            for (item in listOddIndices){
                ItemLayout(topic = item)
            }
        }
    }
}

@Composable
fun ItemLayout(topic: TopicData, modifier: Modifier = Modifier){
    Card(
        modifier = modifier
            .padding(bottom = 16.dp)
            .wrapContentSize()
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)

    ){
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = topic.image),
                contentDescription = topic.name,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(68.dp)
            )

            Column(
                modifier = modifier
                    .wrapContentSize()

            ){
                Text(
                    text = topic.name,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(top = 16.dp, end = 16.dp, bottom = 8.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier
                        .wrapContentSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.surface),
                        modifier = Modifier
                            .padding(end = 8.dp,bottom = 2.dp)
                    )
                    Text(
                        text = topic.numberOfCourses.toString(),
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier
                    )
                }
            }
        }
    }
}