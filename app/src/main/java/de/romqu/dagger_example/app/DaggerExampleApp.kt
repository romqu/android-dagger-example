package de.romqu.dagger_example.app

import android.app.Application
import android.util.Log
import de.romqu.dagger_example.logic.AppLogic
import javax.inject.Inject
import javax.inject.Named

class DaggerExampleApp : Application() {

    @Inject
    lateinit var appLogicInject: AppLogic

    @Inject
    @field:Named("Hello")
    lateinit var helloClass: AppModule.Hello

    @Inject
    @field:Named("HelloTwo")
    lateinit var helloClassTwo: AppModule.Hello

    @Inject
    lateinit var helloClassContext: AppModule.HelloContext

    val appComponent by lazy {

        DaggerAppComponent
            .builder()
            .appModule(AppModule(applicationContext))
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)

        appLogicInject.execute()

        Log.d(
            DaggerExampleApp::class.java.simpleName,
            "${helloClass.text} " +
                    "and ${helloClassTwo.text} " +
                    "and ${helloClassContext.context.packageName}/"
        )


    }

}