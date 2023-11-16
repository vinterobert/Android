package com.tasty.recipesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tasty.recipesapp.databinding.ActivityMainBinding
import com.tasty.recipesapp.databinding.ActivitySplashBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener{
            val toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}