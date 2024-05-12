package com.example.checkin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val layout:LinearLayout=findViewById(R.id.layout)
        val etv:TextView=findViewById(R.id.etv)
        val button2:Button=findViewById(R.id.button2)
        val button3: Button=findViewById(R.id.button3)
        var i: Int=0
button2.setOnClickListener {
    i+=1
    etv.setText(i.toString())
}
        button3.setOnClickListener {
            i-=1
            etv.setText(i.toString())
        }
        }
    }
