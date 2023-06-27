package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IosAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_app)

        val textReadMore= findViewById<TextView>(R.id.readMore)

        textReadMore.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://distantjob.com/blog/best-language-for-ios-app-development/#:~:text=The%206%20Best%20iOS%20Development%20Languages%201%201.,5%205.%20JavaScript%20...%206%206.%20Dart%20")
            startActivity(intent)
        }
    }
}