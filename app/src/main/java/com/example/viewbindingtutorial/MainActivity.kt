package com.example.viewbindingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.viewbindingtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Variabel binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mengakses elemen UI melalui variabel binding
        binding.textView.text = "Hello, View Binding!"
        binding.button.setOnClickListener {
            Log.d("MainActivity", "Button clicked")
        }

    }

}