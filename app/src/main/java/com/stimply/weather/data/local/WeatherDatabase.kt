package com.stimply.weather.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.stimply.weather.data.remote.dto.WeatherDto

@Database(
    entities = [WeatherDto::class],
    version = 1
)
@TypeConverters(WeatherConverters::class)
abstract class WeatherDatabase: RoomDatabase() {
    abstract val dao: WeatherDao
}