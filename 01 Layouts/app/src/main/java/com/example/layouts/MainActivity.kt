package com.example.layouts

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonBlack = findViewById<Button>(R.id.btnblack)
        val buttonYellow = findViewById<Button>(R.id.btnyellow)
        val buttonRed = findViewById<Button>(R.id.btnred)
        val buttonGreen = findViewById<Button>(R.id.btngreen)
        val buttonBlue = findViewById<Button>(R.id.btnblue)
        val buttonWhite = findViewById<Button>(R.id.btnwhite)
        val layout = findViewById<LinearLayout>(R.id.l_layout)

        buttonBlack.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
        buttonYellow.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonRed.setOnClickListener {
            layout.setBackgroundResource(R.color.red)
        }
        buttonGreen.setOnClickListener {
            layout.setBackgroundResource(R.color.green)
        }
        buttonBlue.setOnClickListener {
            layout.setBackgroundResource(R.color.blue)
        }
        buttonWhite.setOnClickListener {
            layout.setBackgroundResource(R.color.white)
        }
    }
}