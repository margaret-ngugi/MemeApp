package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Meme2 : AppCompatActivity() {
    lateinit var  imageView8: ImageView
    lateinit var  imageView7: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        imageView8=findViewById(R.id.imageView8)
        imageView8.setOnClickListener {
            val intent = Intent(this, Memes::class.java)
            startActivity(intent)
        }
        imageView7=findViewById(R.id.imageView7)
        imageView7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}