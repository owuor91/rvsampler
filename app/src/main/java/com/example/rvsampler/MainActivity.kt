package com.example.rvsampler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rvsampler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvNames.layoutManager = LinearLayoutManager(baseContext)
        var names = listOf("Dedan", "Mary", "Lydia", "JKIA", "Armani",
            "Kibera", "Friday")
        var namesAdapter = NamesRvAdapter(names)
        binding.rvNames.adapter = namesAdapter
    }
}