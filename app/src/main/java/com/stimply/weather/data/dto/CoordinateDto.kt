package com.stimply.weather.data.dto

import com.google.gson.annotations.SerializedName

data class CoordinateDto(
    @SerializedName("lon")
    val longitude: Float,
    @SerializedName("lat")
    val latitude: Float
)
