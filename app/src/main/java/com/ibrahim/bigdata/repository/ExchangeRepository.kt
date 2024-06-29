package com.ibrahim.bigdata.repository

import androidx.annotation.WorkerThread
import com.ibrahim.bigdata.database.dao.ExchangeDao
import com.ibrahim.bigdata.models.ExchangeRateResponse
import kotlinx.coroutines.flow.Flow

class ExchangeRepository(private val exchangeDao: ExchangeDao) {
    @WorkerThread
    suspend fun insertExchangeRates(exchangeRates: ExchangeRateResponse) {
        exchangeDao.insertExchangeRates(exchangeRates)
    }

    suspend fun deleteExchangeRates() {
        exchangeDao.deleteExchangeRates()
    }

    val allExchanges: Flow<List<ExchangeRateResponse>> = exchangeDao.getAllExchangeRates()
}