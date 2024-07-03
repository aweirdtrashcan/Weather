package com.stimply.weather.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WeatherConditionDto(
    val id: Int,
    @SerializedName("main")
    val condition: String,
    val description: String,
    @SerializedName("icon")
    val iconId: String
)
