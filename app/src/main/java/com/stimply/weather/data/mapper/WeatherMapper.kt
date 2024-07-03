package com.stimply.weather.data.mapper

import com.stimply.weather.domain.model.Coordinate
import com.stimply.weather.domain.model.VolumeDetail
import com.stimply.weather.domain.model.Weather
import com.stimply.weather.domain.model.WeatherCondition
import com.stimply.weather.domain.model.WeatherDetail
import com.stimply.weather.domain.model.WindDetail
import com.stimply.weather.data.remote.dto.CoordinateDto
import com.stimply.weather.data.remote.dto.VolumeDetailDto
import com.stimply.weather.data.remote.dto.WeatherConditionDto
import com.stimply.weather.data.remote.dto.WeatherDetailDto
import com.stimply.weather.data.remote.dto.WeatherDto
import com.stimply.weather.data.remote.dto.WindDetailDto

fun WeatherDto.toWeather(): Weather {
    return Weather(
        coordinate = coordinate.toCordinate(),
        weatherConditions = weatherConditions.map { it.toWeatherCondition() },
        weatherDetail = weatherDetail.toWeatherDetail(),
        visibility = visibility,
        windDetail = windDetail.toWindDetail(),
        rainDetail = rainDetail?.toVolumeDetail(),
        snowDetail = snowDetail?.toVolumeDetail(),
        cloudiness = cloudDetail.cloudiness,
        calculationDate = calculationDate,
        countryCode = cityInfoDto.countryCode,
        sunriseTime = cityInfoDto.sunriseTime,
        sunsetTime = cityInfoDto.sunsetTime,
        cityName = cityName,
        timezone = timezone
    )
}

fun CoordinateDto.toCordinate(): Coordinate {
    return Coordinate(
        latitude = latitude,
        longitude = longitude
    )
}

fun WeatherConditionDto.toWeatherCondition(): WeatherCondition {
    return WeatherCondition(
        condition = condition,
        description = description,
        iconId = iconId
    )
}

fun WeatherDetailDto.toWeatherDetail(): WeatherDetail {
    return WeatherDetail(
        temperature = temperature,
        feelsLike = feelsLike,
        minTemperature = minTemperature,
        maxTemperature = maxTemperature,
        pressure = pressure,
        humidity = humidity,
        seaLevel = seaLevel,
        groundLevel = groundLevel
    )
}

fun VolumeDetailDto.toVolumeDetail(): VolumeDetail {
    return VolumeDetail(
        lastHourVolume = lastHourVolume,
        lastThreeHoursVolume = lastThreeHoursVolume
    )
}

fun WindDetailDto.toWindDetail(): WindDetail {
    return WindDetail(
        speed = speed,
        directionInDegrees = directionInDegrees
    )
}