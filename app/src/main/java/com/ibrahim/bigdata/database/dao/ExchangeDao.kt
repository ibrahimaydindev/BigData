package com.ibrahim.bigdata.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ibrahim.bigdata.models.ExchangeRateResponse
import kotlinx.coroutines.flow.Flow

@Dao
interface ExchangeDao {
    @Query("SELECT * FROM exchange_rate_response")
    fun getAllExchangeRates(): Flow<List<ExchangeRateResponse>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertExchangeRates(exchangeRates: ExchangeRateResponse)

    @Query("DELETE FROM exchange_rate_response")
    suspend fun deleteExchangeRates()
}