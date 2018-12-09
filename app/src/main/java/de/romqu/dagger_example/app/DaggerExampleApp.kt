package de.romqu.dagger_example.app

import android.app.Application

class DaggerExampleApp : Application() {

    val appComponent by lazy {

        DaggerAppComponent
            .create()
    }

    override fun onCreate() {
        super.onCreate()
    }

}