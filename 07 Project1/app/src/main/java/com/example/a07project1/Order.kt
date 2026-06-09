package com.example.a07project1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        val orders = intent.getStringArrayExtra(MainActivity.KEY)


        if (orders != null && orders.size >= 4) {

            val val1 = findViewById<TextView>(R.id.val1)
            val val2 = findViewById<TextView>(R.id.val2)
            val val3 = findViewById<TextView>(R.id.val3)
            val val4 = findViewById<TextView>(R.id.val4)

            val1.text = orders[0] ?: "NO ORDER PLACED"
            val2.text = orders[1] ?: "NO ORDER PLACED"
            val3.text = orders[2] ?: "NO ORDER PLACED"
            val4.text = orders[3] ?: "NO ORDER PLACED"
        }


    }
}