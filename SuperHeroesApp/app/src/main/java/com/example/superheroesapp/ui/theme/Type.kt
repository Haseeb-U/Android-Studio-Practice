package com.example.superheroesapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.superheroesapp.R

val Righteous_Bold = FontFamily(
    Font(R.font.righteous_regular, FontWeight.Bold)
)

val Exo2_Regular = FontFamily(
    Font(R.font.exo2_regular)
)

val Exo2_Bold = FontFamily(
    Font(R.font.exo2_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val baseline = Typography()

val Typography = Typography(
    displayMedium = baseline.displayMedium.copy(fontFamily = Righteous_Bold),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = Exo2_Bold),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = Exo2_Regular),
)

