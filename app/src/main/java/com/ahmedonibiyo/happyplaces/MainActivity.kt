package com.ahmedonibiyo.happyplaces

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: FloatingActionButton = findViewById(R.id.fabAddHappyPlace)
        fab.setOnClickListener {
            Toast.makeText(this, "Add Happy Places...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, AddHappyPlaceActivity::class.java)
            startActivity(intent)

        }
    }
}