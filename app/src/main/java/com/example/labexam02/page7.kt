package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page7)

        val btnNavigate55: Button = findViewById(R.id.button55)
        btnNavigate55.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }

        val imageView21: ImageView = findViewById(R.id.imageView38)
        imageView21.setOnClickListener {
            val intent = Intent(this, page5::class.java)
            startActivity(intent)
        }

        val imageView25: ImageView = findViewById(R.id.imageView41)
        imageView25.setOnClickListener {
            val intent = Intent(this, page5::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}