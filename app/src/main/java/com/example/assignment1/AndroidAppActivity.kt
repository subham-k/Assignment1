package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AndroidAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_app)

        val textReadMore= findViewById<TextView>(R.id.readMore)

        textReadMore.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.netsolutions.com/insights/best-programming-languages-to-write-develop-android-apps/")
            startActivity(intent)
        }
    }
}