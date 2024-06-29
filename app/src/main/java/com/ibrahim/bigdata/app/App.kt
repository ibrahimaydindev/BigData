package com.ibrahim.bigdata.app

import android.app.Application
import com.google.firebase.FirebaseApp

//General Application class
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        //Initialize Firebase
        FirebaseApp.initializeApp(this)
    }
}