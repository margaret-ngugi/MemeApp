package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Meme3 : AppCompatActivity() {
    lateinit var  imageView12: ImageView
    lateinit var  imageView11: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        imageView12=findViewById(R.id.imageView12)
        imageView12.setOnClickListener {
            val intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
        imageView11=findViewById(R.id.imageView11)
        imageView11.setOnClickListener {
            val intent = Intent(this, Meme3::class.java)
            startActivity(intent)
        }
    }
}