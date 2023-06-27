package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton= findViewById<Button>(R.id.buttonStart)

        startButton.setOnClickListener {
            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}