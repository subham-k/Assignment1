package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val androidApp= findViewById<CardView>(R.id.androidApp)
        val iosApp= findViewById<CardView>(R.id.iosApp)
        val webDevelopment= findViewById<CardView>(R.id.webDevelopment)
        val ai= findViewById<CardView>(R.id.ai)
        val dataAnalytic= findViewById<CardView>(R.id.dataAnalytic)
        val blockChain= findViewById<CardView>(R.id.blockChain)
        val buttonContactUs= findViewById<Button>(R.id.contactUs)

        androidApp.setOnClickListener {
            intent= Intent(applicationContext,AndroidAppActivity::class.java)
            startActivity(intent)
        }

        iosApp.setOnClickListener {
            intent= Intent(applicationContext,IosAppActivity::class.java)
            startActivity(intent)
        }

        webDevelopment.setOnClickListener {
            intent= Intent(applicationContext,webDevelopmentActivity::class.java)
            startActivity(intent)
        }

        ai.setOnClickListener {
            intent= Intent(applicationContext,AiActivity::class.java)
            startActivity(intent)
        }

        dataAnalytic.setOnClickListener {
            intent= Intent(applicationContext,DataAnalyticActivity::class.java)
            startActivity(intent)
        }

        blockChain.setOnClickListener {
            intent= Intent(applicationContext,BlockchainActivity::class.java)
            startActivity(intent)
        }

        buttonContactUs.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:1997" )
            startActivity(intent)
        }
    }
}