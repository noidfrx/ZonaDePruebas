package com.example.zonadepruebas.cursoGaston

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.zonadepruebas.R
import com.example.zonadepruebas.cursoGaston.dataFragments.DataFragmentsActivity
import com.example.zonadepruebas.cursoGaston.navigationComponent.MainNavigationActivity

class MainGastonActivity : AppCompatActivity() {
    private lateinit var btnFragments: Button
    private lateinit var btnNav: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gaston)
        btnFragments = findViewById(R.id.btn1)
        btnFragments.setOnClickListener {
            val i = Intent(this, DataFragmentsActivity::class.java)
            startActivity(i)
        }
        btnNav = findViewById(R.id.btn2)
        btnNav.setOnClickListener {
            val i = Intent(this, MainNavigationActivity::class.java)
            startActivity(i)
        }

    }
}