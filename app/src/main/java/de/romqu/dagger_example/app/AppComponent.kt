package de.romqu.dagger_example.app

import dagger.Component
import de.romqu.dagger_example.main.MainActivity
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun inject(daggerExampleApp: DaggerExampleApp)
    fun inject(mainActivity: MainActivity)
}