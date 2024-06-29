package com.ibrahim.bigdata

import com.ibrahim.bigdata.api.RetrofitClient
import com.ibrahim.bigdata.models.ExchangeRateResponse
import com.ibrahim.bigdata.utils.Keys.Companion.EXCHANGE_API_KEY
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call


fun main() {

    val service = RetrofitClient.service

    // Örneğin, Euro bazlı döviz kurlarını alalım
    val call = service.getLatestRates(EXCHANGE_API_KEY)

    call.enqueue(object : retrofit2.Callback<ExchangeRateResponse> {
        override fun onResponse(
            call: Call<ExchangeRateResponse>,
            response: retrofit2.Response<ExchangeRateResponse>
        ) {
            if (response.isSuccessful) {
                val exchangeRateResponse = response.body()
                exchangeRateResponse?.let {
                    GlobalScope.launch {

                    }
                    println("Base currency: ${it.baseCode}")
                    println("Date: ${it.timeNextUpdateUtc}")
                    println("Rates:")
                    it.conversionRates?.forEach { (currency, rate) ->
                        println("$currency: $rate")
                    }
                }
            } else {
                println("Error: ${response.code()} - ${response.message()}")
            }
        }

        override fun onFailure(call: Call<ExchangeRateResponse>, t: Throwable) {
            println("Failed to fetch exchange rates: ${t.message}")
        }
    })
}
