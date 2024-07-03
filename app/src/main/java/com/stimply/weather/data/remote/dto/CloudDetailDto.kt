package com.stimply.weather.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CloudDetailDto(
    @SerializedName("all")
    val cloudiness: Int
)