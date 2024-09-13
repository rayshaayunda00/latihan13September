package com.rayshaayundami2b.latihan13september

import adapter.PhotoGridAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GalleryPhotoActivity : AppCompatActivity() {

    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.logo_pnp,
        R.drawable.pnp3,
        R.drawable.pnpp,
        R.drawable.images,
        R.drawable.akuntansi,
        R.drawable.logo_ti_pnp,


    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gallery_photo)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = PhotoGridAdapter(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, PhotoDetailActivity::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }


    }
}