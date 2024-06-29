package com.ibrahim.bigdata.app

import android.app.Application
import com.google.firebase.FirebaseApp
import com.ibrahim.bigdata.database.databases.ExchangeDatabase
import com.ibrahim.bigdata.repository.ExchangeRepository

//General Application class
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        //Initialize Firebase
        FirebaseApp.initializeApp(this)
        val database by lazy { ExchangeDatabase.getDatabase(this) }
        val repository by lazy { ExchangeRepository(database.exchangeDao()) }
    }
}