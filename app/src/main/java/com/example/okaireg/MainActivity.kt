package com.example.okaireg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.okaireg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {
        binding.btnClick.setOnClickListener {

        }
    }
}