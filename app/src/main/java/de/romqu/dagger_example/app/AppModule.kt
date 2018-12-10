package de.romqu.dagger_example.app

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideHelloClass(): Hello = Hello("Hello")

    class Hello(val text: String)
}