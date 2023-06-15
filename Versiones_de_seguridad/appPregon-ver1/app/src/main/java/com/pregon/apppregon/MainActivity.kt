package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buton2: Button=findViewById(R.id.btn1)
        buton2.setOnClickListener{siguiente() }
    }

    private fun siguiente(){
    val intent:Intent = Intent(this,catalogo::class.java)
        startActivity(intent)
    }
}

