package com.example.activitylifecycletask

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        Log.e("MainActivity", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy called")
    }
}
