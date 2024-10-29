package com.example.wutheringwavescharacterlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wutheringwavescharacterlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val characters = listOf(
            Character("Aalto", getString(R.string.aalto_description), R.drawable.aalto),
            Character("Baizhi", getString(R.string.baizhi_description), R.drawable.baizhi),
            Character("Chalcaro", getString(R.string.chalcaro_description), R.drawable.calcharo)
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CharacterAdapter(this, characters)
    }
}
