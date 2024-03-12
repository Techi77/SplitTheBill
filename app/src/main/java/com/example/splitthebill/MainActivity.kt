package com.example.splitthebill

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.splitthebill.databinding.FMainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FMainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FMainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}