package de.romqu.dagger_example.app

import android.app.Application
import de.romqu.dagger_example.logic.AppLogic
import javax.inject.Inject

class DaggerExampleApp : Application() {

    @Inject
    lateinit var appLogic: AppLogic

    val appComponent by lazy {

        DaggerAppComponent
            .create()
    }


    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)

        appLogic.execute()
    }

}