package de.romqu.dagger_example.logic

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class AppLogic @Inject constructor(
    private val subAppLogic: SubAppLogic
) {

    fun execute() = subAppLogic.execute()
}