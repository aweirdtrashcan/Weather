package com.stimply.weather.domain.model

data class WeatherCondition(
    val condition: String,
    val description: String,
    val iconId: String
)
