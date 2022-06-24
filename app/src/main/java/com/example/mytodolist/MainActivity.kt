package com.example.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytodolist.databinding.ActivityListMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityListMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}