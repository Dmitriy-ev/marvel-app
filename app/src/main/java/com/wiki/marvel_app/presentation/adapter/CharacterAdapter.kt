package com.wiki.marvel_app.presentation.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import com.wiki.marvel_app.R
import com.wiki.marvel_app.databinding.ItemCharacterBinding
import com.wiki.marvel_app.domain.model.Character

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {

    var character = ArrayList<Character>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
        val binding = ItemCharacterBinding.inflate(view, parent, false)
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = character[position]
        with(holder.binding) {
            characterName.text = character.name
            val imageUrl = "${character.thumbnail}/portrait_xlarge.${character.thumbnailExt}"
            Log.d("Image", imageUrl)
            Picasso.get().load(imageUrl).into(characterImage)
        }
    }

    override fun getItemCount(): Int = character.count()
}

