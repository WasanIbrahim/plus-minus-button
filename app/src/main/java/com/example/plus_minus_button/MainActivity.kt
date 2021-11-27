package com.example.plus_minus_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number = 0
    lateinit var numText: TextView
    lateinit var minusButton: TextView
    lateinit var plusButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numText = findViewById(R.id.numText)
        minusButton = findViewById(R.id.minusButton)
        plusButton = findViewById(R.id.plusButton)


        minusButton.setOnClickListener {
            changeValue(false)
        }

        plusButton.setOnClickListener {
            changeValue(true)
        }

    }

    fun changeValue(add: Boolean) {
        if (add) {
            number++
        } else {
            number--
        }
        numText.text = number.toString()
    }

}
