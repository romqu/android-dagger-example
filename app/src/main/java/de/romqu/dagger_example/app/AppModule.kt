package de.romqu.dagger_example.app

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule(val applicationContext: Context) {

    @Provides
    @Singleton
    @Named("Hello")
    fun provideHelloClass(): Hello = Hello("Hello")

    @Provides
    @Singleton
    @Named("HelloTwo")
    fun provideHelloClassTwo(): Hello = Hello("Hello Two")

    @Provides
    @Singleton
    fun provideHelloContextClass(): HelloContext {
        return HelloContext(applicationContext)
    }

    class Hello(val text: String)

    class HelloContext(val context: Context)
}