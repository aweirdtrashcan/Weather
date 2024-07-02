package com.stimply.weather.util

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T, message: String? = null): Resource<T>(data, message)
    class Loading<T>(val isLoading: Boolean, message: String? = null, data: T? = null): Resource<T>(data, message)
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
}