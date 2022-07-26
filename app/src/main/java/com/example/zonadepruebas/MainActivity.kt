package com.example.zonadepruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.zonadepruebas.cursoGaston.MainGastonActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnGaston: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGaston = findViewById(R.id.btnGaston)
        btnGaston.setOnClickListener {
            val i = Intent(this, MainGastonActivity::class.java)
            startActivity(i)
        }
    }
}