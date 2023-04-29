package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  imageView6: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView6=findViewById(R.id.imageView6)
        imageView6.setOnClickListener{
            val intent=Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }
}