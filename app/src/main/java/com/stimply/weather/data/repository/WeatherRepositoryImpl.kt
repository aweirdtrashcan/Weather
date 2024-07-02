package com.stimply.weather.data.repository

import com.stimply.weather.data.local.WeatherDatabase
import com.stimply.weather.data.mapper.toWeather
import com.stimply.weather.data.remote.WeatherApi
import com.stimply.weather.domain.model.Weather
import com.stimply.weather.domain.repository.WeatherRepository
import com.stimply.weather.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class WeatherRepositoryImpl(
    private val api: WeatherApi,
    private val db: WeatherDatabase
): WeatherRepository {

    override fun getWeather(
        latitude: Float,
        longitude: Float,
        weatherUnit: String
    ): Flow<Resource<Weather>> {
        return flow {
            emit(Resource.Loading(true))

            val localWeather = db.dao.getWeathers()

            if (localWeather.isNotEmpty()) {
                emit(Resource.Success(
                    data = localWeather[0].toWeather()
                ))
            }

            val remoteWeather = try {
                api.getWeather(
                    latitude = latitude,
                    longitude = longitude,
                    unit = weatherUnit
                )
            } catch (e: Exception) {
                emit(Resource.Error("Falha ao atualizar os dados do tempo." +
                        " Certifique-se que sua conexão com a internet está estável!"))
                e.printStackTrace()
                emit(Resource.Loading(false))
                return@flow
            }

            db.dao.deleteAllWeathers()
            db.dao.insertWeather(remoteWeather)
            emit(Resource.Success(db.dao.getWeathers()[0].toWeather()))
            emit(Resource.Loading(false))
        }
    }

}