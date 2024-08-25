package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        val imageView10: ImageView = findViewById(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this, page6::class.java)
            startActivity(intent)
        }

        val imageView19: ImageView = findViewById(R.id.imageView19)
        imageView19.setOnClickListener {
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
        }

        val imageView20: ImageView = findViewById(R.id.imageView11)
        imageView20.setOnClickListener {
            val intent = Intent(this, page8::class.java)
            startActivity(intent)
        }

        val imageView22: ImageView = findViewById(R.id.imageView40)
        imageView22.setOnClickListener {
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
        }

        val imageView23: ImageView = findViewById(R.id.imageView39)
        imageView23.setOnClickListener {
            val intent = Intent(this, page9::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}