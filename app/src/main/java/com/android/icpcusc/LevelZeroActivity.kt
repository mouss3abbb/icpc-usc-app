package com.android.icpcusc

import adapter.LevelZeroAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.icpcusc.databinding.ActivityLevelZeroBinding

class LevelZeroActivity : AppCompatActivity() {
    lateinit var binding: ActivityLevelZeroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelZeroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.levelZeroTopics.adapter = LevelZeroAdapter()
        binding.levelZeroTopics.setHasFixedSize(true)
        binding.levelZeroTopics.layoutManager = LinearLayoutManager(this)

    }
}