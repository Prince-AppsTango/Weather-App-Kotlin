package com.app.weatherapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {
    private val baseUrl = "https://api.weatherapi.com"
    private fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
    val weatherApi:WeatherApi = getInstance().create(WeatherApi::class.java)
}

//https://api.weatherapi.com/v1/current.json?key=f94ebcf82a9d48909e6102330243010&q=London