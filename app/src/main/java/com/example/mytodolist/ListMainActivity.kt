package com.example.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytodolist.adapter.Todoadapter
import com.example.mytodolist.databinding.ActivityListMainBinding

class ListMainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityListMainBinding
    private lateinit var todoadapter: Todoadapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        todoadapter = Todoadapter()

        binding.rvTodo.adapter = todoadapter
        //어댑터 세팅


    }
}