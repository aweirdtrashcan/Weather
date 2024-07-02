package com.stimply.weather.data.remote

import com.stimply.weather.domain.model.WeatherApiUnit
import com.stimply.weather.data.dto.WeatherDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getWeather(
        @Query("lat") latitude: Float,
        @Query("lon") longitude: Float,
        @Query("appid") apiKey: String = Companion.apiKey,
        @Query("units") unit: String = WeatherApiUnit.metric
    ): WeatherDto

    companion object {
        const val apiKey = "cb174bd864fdb60cbd0fb0f8d6f795bd"
        const val baseUrl = "https://api.openweathermap.org/data/2.5/"
    }
}