package de.romqu.dagger_example.app

import android.app.Application
import de.romqu.dagger_example.logic.AppLogic
import javax.inject.Inject
import javax.inject.Provider

class DaggerExampleApp : Application() {

    @Inject
    lateinit var appLogicInject: AppLogic

    private val appComponent by lazy {

        DaggerAppComponent
            .create()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)

        appLogicInject.execute()

    }

}