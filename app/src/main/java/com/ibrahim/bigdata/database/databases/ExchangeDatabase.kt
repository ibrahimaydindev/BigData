package com.ibrahim.bigdata.database.databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ibrahim.bigdata.database.dao.ExchangeDao
import com.ibrahim.bigdata.models.ExchangeRateResponse

@Database(entities = [ExchangeRateResponse::class], version = 1, exportSchema = false)
abstract class ExchangeDatabase : RoomDatabase() {
    abstract fun exchangeDao(): ExchangeDao

    companion object{
        @Volatile
        private var INSTANCE: ExchangeDatabase? = null

        fun getDatabase(context: Context): ExchangeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ExchangeDatabase::class.java,
                    "exchange_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}