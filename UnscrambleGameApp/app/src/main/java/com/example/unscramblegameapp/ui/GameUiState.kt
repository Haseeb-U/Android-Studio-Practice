package com.example.unscramblegameapp.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    var userGuess: String = "",
    val score: Int = 0,
    val currentWordCount: Int = 1,
    val isGameOver: Boolean = false
)
