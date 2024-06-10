package com.example.weatherapp


import MainActivity2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.weatherapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MainActivity2::class.java)
            // start the activity
            startActivity(intent)
        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            // close the application
            finishAffinity()
        }
    }
}
