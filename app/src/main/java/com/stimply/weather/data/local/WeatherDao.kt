package com.stimply.weather.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.stimply.weather.data.remote.dto.WeatherDto
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {

    @Query("SELECT * FROM weather_table")
    suspend fun getWeathers(): List<WeatherDto>

    @Query("DELETE FROM weather_table")
    suspend fun deleteAllWeathers()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(weatherDto: WeatherDto)
}