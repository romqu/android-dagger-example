package de.romqu.dagger_example.app

import dagger.Component
import javax.inject.Singleton

@Component
interface AppComponent {

    fun inject(daggerExampleApp: DaggerExampleApp)
}