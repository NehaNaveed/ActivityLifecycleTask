package com.example.activitylifecycletask

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second)
        val back = findViewById<Button>(R.id.button2)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        Log.e("SecondActivity", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SecondActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SecondActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SecondActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SecondActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SecondActivity", "onDestroy called")
    }

}