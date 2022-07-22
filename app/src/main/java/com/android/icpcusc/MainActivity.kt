package com.android.icpcusc

import adapter.SlideshowAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.icpcusc.databinding.ActivityMainBinding
import model.SlideshowDatasource

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.slideshow.adapter = SlideshowAdapter()
        binding.slideshow.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        binding.slideshow.setHasFixedSize(true)
        binding.level0Button.setOnClickListener { startActivity(Intent(this,LevelZeroActivity::class.java)) }
        binding.level1Button.setOnClickListener { startActivity(Intent(this,LevelOneActivity::class.java)) }
    }
}