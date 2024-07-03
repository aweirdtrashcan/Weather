package com.stimply.weather.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WeatherDetailDto(
    @SerializedName("temp")
    val temperature: Float,
    @SerializedName("feels_like")
    val feelsLike: Float,
    @SerializedName("temp_min")
    val minTemperature: Float,
    @SerializedName("temp_max")
    val maxTemperature: Float,
    @SerializedName("pressure")
    val pressure: Int,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("sea_level")
    val seaLevel: Int,
    @SerializedName("grnd_level")
    val groundLevel: Int
)
