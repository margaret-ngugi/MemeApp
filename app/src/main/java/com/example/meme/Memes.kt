package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Memes : AppCompatActivity() {
    lateinit var imageView10: ImageView
    lateinit var imageView9: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memes)
        imageView10 = findViewById(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
        imageView9 = findViewById(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}