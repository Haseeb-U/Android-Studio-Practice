package com.example.animalswikiapp

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.animalswikiapp.Data.Animal
import com.example.animalswikiapp.Data.AnimalList


@Composable
fun AppBody(
    modifier: Modifier = Modifier
){
    LazyColumn(
        modifier = modifier
    ){
        items(AnimalList){ animal ->
            AnimalCard(
                animal = animal,
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
                    .clip(MaterialTheme.shapes.large)
            )
        }
    }
}

@Composable
fun AnimalCard(
    animal: Animal,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val textColor= if(expanded) MaterialTheme.colorScheme.tertiaryContainer else MaterialTheme.colorScheme.onSecondaryContainer
    val backgroundColor by animateColorAsState(
        targetValue = if(expanded) MaterialTheme.colorScheme.onTertiaryContainer else MaterialTheme.colorScheme.secondaryContainer
    )
    Card(
        onClick = { expanded = !expanded },
        modifier = modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column(
            modifier = Modifier
                .background(backgroundColor)
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = animal.nameRes),
                style = MaterialTheme.typography.displayMedium,
                color = textColor
            )
            Image(
                painter = painterResource(id = animal.imageRes),
                contentDescription = stringResource(id = animal.nameRes),
                modifier = Modifier
                    .clip(MaterialTheme.shapes.small)
            )
            if(expanded){
                Text(
                    text = stringResource(id = animal.descriptionRes),
                    style = MaterialTheme.typography.headlineMedium,
                    color = textColor
                )
            }
            if(!expanded){
                Text(
                    text = "-",
                    style = MaterialTheme.typography.displayMedium,
                    color = textColor
                )

            }
        }
    }
}