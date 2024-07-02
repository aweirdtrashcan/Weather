package com.stimply.weather.data.dto

import com.google.gson.annotations.SerializedName

data class VolumeDetailDto(
    @SerializedName("1h")
    val lastHourVolume: Float?,
    @SerializedName("3h")
    val lastThreeHoursVolume: Float?
)
