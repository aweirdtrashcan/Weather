package com.stimply.weather.domain.repository

import com.stimply.weather.domain.model.Weather
import com.stimply.weather.util.Resource
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeather(
        latitude: Float,
        longitude: Float,
        weatherUnit: String
    ): Flow<Resource<Weather>>
}