package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BlockchainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)

        val textReadMore= findViewById<TextView>(R.id.readMore)

        textReadMore.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/top-10-programming-languages-for-blockchain-development/")
            startActivity(intent)
        }
    }
}