package com.example.wasingun_first_application

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation_main)
        BottomNavigationView.itemIconTintList = null
    }
}