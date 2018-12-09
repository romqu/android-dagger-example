package de.romqu.dagger_example.logic

import com.orhanobut.logger.Logger
import javax.inject.Inject


class AppLogic @Inject constructor(){

    fun execute() = Logger.d("Hi!")
}