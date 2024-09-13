package com.rayshaayundami2b.latihan13september

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize buttons
        val btnMi = findViewById<Button>(R.id.btn_mi)
        val btnKomputer = findViewById<Button>(R.id.btn_komputer)
        val btnGaleri = findViewById<Button>(R.id.btn_galeri)

        // Set onClickListeners for buttons
        btnMi.setOnClickListener {
            val intent = Intent(this, ManajemenInformatika::class.java)
            startActivity(intent)
        }


        btnKomputer.setOnClickListener {
            val intent = Intent(this, teknikkomputer::class.java)
            startActivity(intent)
        }

        btnGaleri.setOnClickListener {
            val intent = Intent(this, GalleryPhotoActivity::class.java)
            startActivity(intent)
        }


    }
    }




