package de.romqu.dagger_example.app

import android.app.Application
import de.romqu.dagger_example.logic.AppLogic
import javax.inject.Inject
import javax.inject.Provider

class DaggerExampleApp : Application() {

    @Inject
    lateinit var appLogicInject: AppLogic

    @Inject
    lateinit var provider: Provider<AppLogic>

    private val appComponent by lazy {

        DaggerAppComponent
            .create()
    }

    private val appLogicComponent by lazy {
        appComponent.appLogic()
    }

    private val appLogicProvider by lazy {
        provider.get()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)

        appLogicInject.execute()

        appLogicComponent.execute()

        appLogicProvider.execute()

    }

}