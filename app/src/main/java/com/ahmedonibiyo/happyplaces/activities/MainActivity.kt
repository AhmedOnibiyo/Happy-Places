package com.ahmedonibiyo.happyplaces.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ahmedonibiyo.happyplaces.R
import com.ahmedonibiyo.happyplaces.database.DatabaseHandler
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: FloatingActionButton = findViewById(R.id.fabAddHappyPlace)
        fab.setOnClickListener {
            val intent = Intent(this, AddHappyPlaceActivity::class.java)
            startActivity(intent)
        }

        getHappyPlacesFromLocalDB()
    }

    private fun getHappyPlacesFromLocalDB() {
        val dbHandler = DatabaseHandler(this)
        val getHappyPlacesList = dbHandler.getHappyPlacesList()

        if (getHappyPlacesList.size > 0) {
            for (i in getHappyPlacesList) {
                Log.e("Title: ", i.title)
                Log.e("Description: ", i.description)
            }
        }
    }
}