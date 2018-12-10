package de.romqu.dagger_example.app

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    @Named("Hello")
    fun provideHelloClass(): Hello = Hello("Hello")

    @Provides
    @Singleton
    @Named("HelloTwo")
    fun provideHelloClassTwo(): Hello = Hello("Hello Two")

    class Hello(val text: String)
}