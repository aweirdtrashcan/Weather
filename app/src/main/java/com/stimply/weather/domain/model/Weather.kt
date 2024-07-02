package com.stimply.weather.domain.model

data class Weather(
    val coordinate: Coordinate,
    val weatherConditions: List<WeatherCondition>,
    val weatherDetail: WeatherDetail,
    val visibility: Int,
    val windDetail: WindDetail,
    val rainDetail: VolumeDetail?,
    val snowDetail: VolumeDetail?,
    val cloudiness: Int,
    val calculationDate: Long,
    val countryCode: String,
    val sunriseTime: Long,
    val sunsetTime: Long,
    val cityName: String,
    val timezone: Long
)
