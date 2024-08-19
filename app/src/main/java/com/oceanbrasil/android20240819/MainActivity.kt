package com.oceanbrasil.android20240819

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_alternativo)

        val btEnviar = findViewById<Button>(R.id.button2)
        val tvMensagem = findViewById<TextView>(R.id.textView)

        btEnviar.setOnClickListener {
            //trocar o texto
            tvMensagem.text = "Novo texto..."
        }


    }
}