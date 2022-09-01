package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener{
            Toast.makeText(this, "Please Wait...", Toast.LENGTH_SHORT).show()
        }
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = java.util.Random().nextInt(6) + 1

        resultText.text= randomInt.toString()
    }
}