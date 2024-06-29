package com.ibrahim.bigdata.api

import com.ibrahim.bigdata.services.ExchangeRateApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// To use Retrofit, you need to create an instance of the Retrofit class.
object RetrofitClient {

    private val BASE_URL = "https://v6.exchangerate-api.com/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service: ExchangeRateApiService by lazy {
        retrofit.create(ExchangeRateApiService::class.java)
    }
}