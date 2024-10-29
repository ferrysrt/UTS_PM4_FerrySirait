package com.example.wutheringwavescharacterlist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(
    private val context: Context,
    private val characterList: List<Character>
) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characterList[position]
        holder.characterImage.setImageResource(character.imageResId)
        holder.characterName.text = character.name

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("characterName", character.name)
            intent.putExtra("characterDescription", character.description)
            intent.putExtra("characterImageResId", character.imageResId)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = characterList.size

    inner class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val characterImage: ImageView = view.findViewById(R.id.characterImage)
        val characterName: TextView = view.findViewById(R.id.characterName)
    }
}
