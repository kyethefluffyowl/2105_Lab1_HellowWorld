package com.example.a2105_lab1_hellowworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val UWU = "sowwy"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(UWU, "Yas Queen")
    }
}