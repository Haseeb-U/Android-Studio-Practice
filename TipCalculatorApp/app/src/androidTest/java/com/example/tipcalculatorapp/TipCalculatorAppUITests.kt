package com.example.tipcalculatorapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.tipcalculatorapp.ui.theme.TipCalculatorAppTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorAppUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipCalculatorAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    TipCalculatorAppLayout(modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding())
                }
            }
        }
        composeTestRule.onNodeWithText("Bill Amount")
            .performTextInput("100.5")
        composeTestRule.onNodeWithText("Tip Percentage")
            .performTextInput("20")
        composeTestRule.onNodeWithTag("RoundUpSwitch")
            .performClick()
        val expectedTip = NumberFormat.getCurrencyInstance().format(21)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
            "No node with this text was found."
        )
    }
}