package com.ahmedonibiyo.happyplaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class AddHappyPlaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_happy_place)

        val tb = findViewById<Toolbar>(R.id.toolbar_add_place)
        setSupportActionBar(tb)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        tb.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}