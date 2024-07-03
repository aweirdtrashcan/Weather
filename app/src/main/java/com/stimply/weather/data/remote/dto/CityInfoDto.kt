package com.stimply.weather.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CityInfoDto(
    @SerializedName("type")
    val type: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("country")
    val countryCode: String,
    @SerializedName("sunrise")
    val sunriseTime: Long,
    @SerializedName("sunset")
    val sunsetTime: Long
)