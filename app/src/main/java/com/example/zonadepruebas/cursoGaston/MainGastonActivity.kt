package com.example.zonadepruebas.cursoGaston

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.zonadepruebas.R
import com.example.zonadepruebas.cursoGaston.dataFragments.DataFragmentsActivity

class MainGastonActivity : AppCompatActivity() {
    private lateinit var btnFragments: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gaston)
        btnFragments = findViewById(R.id.btn1)
        btnFragments.setOnClickListener {
            val i = Intent(this, DataFragmentsActivity::class.java)
            startActivity(i)
        }
    }
}