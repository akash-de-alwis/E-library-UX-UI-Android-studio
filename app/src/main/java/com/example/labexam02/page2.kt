package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        val btnNavigate1: Button = findViewById(R.id.button3)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
        }

        val btnNavigate2: Button = findViewById(R.id.button2)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, page5::class.java)
            startActivity(intent)
        }

        val btnNavigate3: Button = findViewById(R.id.button4)
        btnNavigate3.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}