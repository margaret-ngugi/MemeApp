package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Meme4 : AppCompatActivity() {
    lateinit var  imageView14: ImageView
    lateinit var  imageView13: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        imageView14=findViewById(R.id.imageView14)
        imageView14.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    imageView13=findViewById(R.id.imageView13)
    imageView13.setOnClickListener {
        val intent = Intent(this, Memes::class.java)
        startActivity(intent)
    }
    }
}