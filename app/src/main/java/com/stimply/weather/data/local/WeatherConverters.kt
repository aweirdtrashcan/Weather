package com.stimply.weather.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.stimply.weather.data.remote.dto.CityInfoDto
import com.stimply.weather.data.remote.dto.CloudDetailDto
import com.stimply.weather.data.remote.dto.CoordinateDto
import com.stimply.weather.data.remote.dto.VolumeDetailDto
import com.stimply.weather.data.remote.dto.WeatherConditionDto
import com.stimply.weather.data.remote.dto.WeatherDetailDto
import com.stimply.weather.data.remote.dto.WindDetailDto
import javax.inject.Inject

class WeatherConverters {

    @Inject
    lateinit var gson: Gson

    @TypeConverter
    fun fromWeatherConditionDtoToJson(weatherConditions: List<WeatherConditionDto>?): String? {
        return gson.toJson(weatherConditions)
    }

    @TypeConverter
    fun fromJsonToWeatherConditionDto(weatherConditions: String?): List<WeatherConditionDto>? {
        val listType = object : TypeToken<List<WeatherConditionDto>>() {}.type
        return gson.fromJson(weatherConditions, listType)
    }

    @TypeConverter
    fun fromCoordinateDtoToJson(coordinateDto: CoordinateDto?): String? {
        return gson.toJson(coordinateDto)
    }

    @TypeConverter
    fun fromJsonToCoordinateDto(coordinateDto: String?): CoordinateDto? {
        val type = object : TypeToken<CoordinateDto>() {}.type
        return gson.fromJson(coordinateDto, type)
    }

    @TypeConverter
    fun fromWeatherDetailDtoToJson(weatherDetailDto: WeatherDetailDto?): String? {
        return gson.toJson(weatherDetailDto)
    }

    @TypeConverter
    fun fromJsonToWeatherDetailDto(weatherDetailDto: String?): WeatherDetailDto? {
        val type = object : TypeToken<WeatherDetailDto>() {}.type
        return gson.fromJson(weatherDetailDto, type)
    }

    @TypeConverter
    fun fromWindDetailDtoToJson(windDetailDto: WindDetailDto?): String? {
        return gson.toJson(windDetailDto)
    }

    @TypeConverter
    fun fromJsonToWindDetailDto(windDetailDto: String?): WindDetailDto? {
        val type = object : TypeToken<WindDetailDto>() {}.type
        return gson.fromJson(windDetailDto, type)
    }

    @TypeConverter
    fun fromVolumeDetailDtoToJson(volumeDetailDto: VolumeDetailDto?): String? {
        return gson.toJson(volumeDetailDto)
    }

    @TypeConverter
    fun fromJsonToVolumeDetailDto(volumeDetailDto: String?): VolumeDetailDto? {
        val type = object : TypeToken<VolumeDetailDto>() {}.type
        return gson.fromJson(volumeDetailDto, type)
    }

    @TypeConverter
    fun fromCloudDetailDtoToJson(cloudDetailDto: CloudDetailDto?): String? {
        return gson.toJson(cloudDetailDto)
    }

    @TypeConverter
    fun fromJsonToCloudDetailDto(cloudDetailDto: String?): CloudDetailDto? {
        val type = object : TypeToken<CloudDetailDto>() {}.type
        return gson.fromJson(cloudDetailDto, type)
    }

    @TypeConverter
    fun fromCityInfoDtoToJson(cityInfoDto: CityInfoDto?): String? {
        return gson.toJson(cityInfoDto)
    }

    @TypeConverter
    fun fromJsonToCityInfoDto(cityInfoDto: String?): CityInfoDto? {
        val type = object : TypeToken<CityInfoDto>() {}.type
        return gson.fromJson(cityInfoDto, type)
    }
}