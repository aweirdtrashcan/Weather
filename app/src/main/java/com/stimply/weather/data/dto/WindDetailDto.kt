package com.stimply.weather.data.dto

import com.google.gson.annotations.SerializedName

data class WindDetailDto(
    @SerializedName("speed")
    val speed: Float,
    @SerializedName("deg")
    val directionInDegrees: Int,
    @SerializedName("gust")
    val gust: Float
)