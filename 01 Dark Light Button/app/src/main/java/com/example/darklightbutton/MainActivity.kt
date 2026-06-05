package com.example.darklightbutton
//import com.example.myapplication2.R
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDak = findViewById< Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonLight.setOnClickListener{
            //Change to light mode
            layout.setBackgroundResource(R.color.white)
        }

        buttonDak.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
    }

}


