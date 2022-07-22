package com.android.icpcusc

import adapter.LevelOneAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.icpcusc.databinding.ActivityLevelOneBinding

class LevelOneActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLevelOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.levelOneTopics.adapter = LevelOneAdapter()
        binding.levelOneTopics.setHasFixedSize(true)
        binding.levelOneTopics.layoutManager = LinearLayoutManager(this)
    }
}