package com.example.madpractical4_20012021010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent=intent
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.text)
        messageTextView.text = "Your message is: " + message
    }
}