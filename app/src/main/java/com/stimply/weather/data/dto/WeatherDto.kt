package com.stimply.weather.data.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("weather_table")
data class WeatherDto(
    @SerializedName("coord")
    val coordinate: CoordinateDto,
    @SerializedName("weather")
    val weatherConditions: List<WeatherConditionDto>,
    @SerializedName("base")
    val base: String,
    @SerializedName("main")
    val weatherDetail: WeatherDetailDto,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("wind")
    val windDetail: WindDetailDto,
    @SerializedName("rain")
    val rainDetail: VolumeDetailDto?,
    @SerializedName("snow")
    val snowDetail: VolumeDetailDto?,
    @SerializedName("clouds")
    val cloudDetail: CloudDetailDto,
    /* Time of data calculation, unix, UTC */
    @SerializedName("dt")
    val calculationDate: Long,
    @SerializedName("sys")
    val cityInfoDto: CityInfoDto,
    @SerializedName("timezone")
    val timezone: Long,
    @SerializedName("id")
    @PrimaryKey
    val id: Long,
    @SerializedName("name")
    val cityName: String,
    @SerializedName("cod")
    val cod: Int
)
