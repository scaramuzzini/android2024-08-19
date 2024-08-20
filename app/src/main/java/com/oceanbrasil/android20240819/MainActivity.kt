package com.oceanbrasil.android20240819

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_alternativo)

        val btEnviar = findViewById<Button>(R.id.button2)
        val tvMensagem = findViewById<TextView>(R.id.textView)

        val etNome = findViewById<EditText>(R.id.editTextText)
        val tvNomeDigitado = findViewById<TextView>(R.id.tvNomeDigitado)

        val novaTelaIntent = Intent(this, ResultadoActivity::class.java)
        btEnviar.setOnClickListener {
            //trocar o texto
            tvNomeDigitado.text = etNome.text
            startActivity(novaTelaIntent)
        }


    }
}