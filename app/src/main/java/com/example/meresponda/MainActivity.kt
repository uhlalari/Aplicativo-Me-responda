package com.example.meresponda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    val res = arrayOf("Sim", "Não", "Talvez")

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.botao).setOnClickListener{
            var texto = findViewById<EditText>(R.id.editTextTextPersonName).text
            if (texto.isEmpty()){
                findViewById<TextView>(R.id.textView2).text = "Qual a pergunta?"
            } else {
                var random = Random().nextInt(3)
                findViewById<TextView>(R.id.textView2).text = res[random]
            }
        }
    }
}