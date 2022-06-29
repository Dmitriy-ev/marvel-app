package com.wiki.marvel_app.presentation.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wiki.marvel_app.databinding.ActivityMainBinding

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {

    private val character = ArrayList<CharacterModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = character.count()
}