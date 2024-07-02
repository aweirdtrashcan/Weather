package com.stimply.weather.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stimply.weather.domain.model.Weather

@Database(
    entities = [Weather::class],
    version = 1
)
abstract class WeatherDatabase: RoomDatabase() {
    abstract val dao: WeatherDao
}