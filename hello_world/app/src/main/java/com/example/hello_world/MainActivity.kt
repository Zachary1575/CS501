package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    // When the application boots
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // We select these some elements
        val theTextView: TextView = findViewById(R.id.textView3)
        val theButton: Button = findViewById(R.id.button)

        theButton.setOnClickListener {
            theTextView.text = getString(R.string.hello_world)
        }

    }
}