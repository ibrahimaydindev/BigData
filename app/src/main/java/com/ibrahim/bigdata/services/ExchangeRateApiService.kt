package com.ibrahim.bigdata.services

import com.ibrahim.bigdata.models.ExchangeRateResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


//This interface is used to define the API endpoints and the HTTP methods that will be used to interact with the API.
interface ExchangeRateApiService {
    @GET("v6/{apiKey}/latest/usd")
    fun getLatestRates(
        @Path("apiKey") apiKey: String
    ): Call<ExchangeRateResponse>
}