package com.trapp.DiceRollerAndroidKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "LET'S ROLL"
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val resultText: TextView = findViewById(R.id.result_text)

        val randomNumber = Random().nextInt(6) + 1

        resultText.text = randomNumber.toString()
    }
}
