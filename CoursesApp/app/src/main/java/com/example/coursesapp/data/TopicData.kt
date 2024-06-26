package com.example.coursesapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TopicData(
    val name: String,
    val numberOfCourses: Int,
    @DrawableRes val image: Int
    )
