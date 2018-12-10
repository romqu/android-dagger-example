package de.romqu.dagger_example.app

import dagger.Component
import de.romqu.dagger_example.logic.AppLogic
import javax.inject.Singleton

@Component
@Singleton
interface AppComponent {

    fun appLogic(): AppLogic

    fun inject(daggerExampleApp: DaggerExampleApp)
}