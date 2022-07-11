package com.wiki.marvel_app.presentation.adapter

import com.wiki.marvel_app.domain.model.Character

data class CharacterCellModel(
    val id: Int,
    val name: String,
    val description: String,
    val thumbnail: String,
    val thumbnailExt: String,
    val comics: List<String>
)
