package com.example.wutheringwavescharacterlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wutheringwavescharacterlist.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Tombol back

        val characterName = intent.getStringExtra("characterName")
        val characterDescription = intent.getStringExtra("characterDescription")
        val characterImageResId = intent.getIntExtra("characterImageResId", -1)

        binding.characterImage.setImageResource(characterImageResId)
        binding.characterNameText.text = characterName
        binding.characterDescriptionText.text = characterDescription
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
