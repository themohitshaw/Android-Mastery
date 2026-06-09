package com.example.a07project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    companion object{
        const val  KEY = "com.example.a07project1.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val eT1 = findViewById<EditText>(R.id.eT1)
        val eT2 = findViewById<EditText>(R.id.eT2)
        val eT3 = findViewById<EditText>(R.id.eT3)
        val eT4 = findViewById<EditText>(R.id.eT4)


        btnOrder.setOnClickListener {
            val order1 = eT1.text.toString()+" "
            val order2 = eT2.text.toString()+" "
            val order3 = eT3.text.toString()+" "
            val order4 = eT4.text.toString()+" "

            val orders = arrayOf(order1 , order2 , order3 , order4)
            intent = Intent(this,Order::class.java)

            intent.putExtra(KEY, orders)

            startActivity(intent)
        }

    }
}