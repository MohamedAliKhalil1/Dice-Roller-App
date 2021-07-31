package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val textView : TextView = findViewById(R.id.textView)
            textView.text = (1..6).random().toString()
            Toast.makeText(this, "Dice rolled !!", Toast.LENGTH_SHORT).show()
        }
    }
}