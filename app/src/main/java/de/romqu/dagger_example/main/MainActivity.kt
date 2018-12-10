package de.romqu.dagger_example.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.romqu.dagger_example.R
import de.romqu.dagger_example.app.DaggerExampleApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as DaggerExampleApp)
            .appComponent
            .inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

    }
}
