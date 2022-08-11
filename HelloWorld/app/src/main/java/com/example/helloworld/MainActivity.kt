package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kotlin file is where we are handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show the layout file: activity_main
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label.
        //1. Add a button to the layout
        //get a reference to button
        //2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            //handle button tap
            // 2. change the color of the text
            Log.i("Bidhan", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }



    }
}