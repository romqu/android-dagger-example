package de.romqu.dagger_example.logic

import android.util.Log
import com.orhanobut.logger.Logger
import javax.inject.Inject


class AppLogic @Inject constructor(){

    fun execute() = Log.d(AppLogic::class.java.simpleName, "Hi!")
}