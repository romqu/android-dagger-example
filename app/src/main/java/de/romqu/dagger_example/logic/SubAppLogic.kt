package de.romqu.dagger_example.logic

import android.util.Log
import javax.inject.Inject

class SubAppLogic @Inject constructor() {

    fun execute() =
        Log.d(SubAppLogic::class.java.simpleName, "Hi from SubAppLogic!")
}