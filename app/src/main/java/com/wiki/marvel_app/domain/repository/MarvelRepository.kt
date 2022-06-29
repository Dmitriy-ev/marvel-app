package com.wiki.marvel_app.domain.repository

import com.wiki.marvel_app.data.dto.CharacterDTO
import com.wiki.marvel_app.domain.model.Character

interface MarvelRepository {

    suspend fun getAllCharacter(): List<Character>
}