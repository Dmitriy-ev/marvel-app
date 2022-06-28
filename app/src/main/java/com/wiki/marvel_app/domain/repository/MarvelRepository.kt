package com.wiki.marvel_app.domain.repository

import com.wiki.marvel_app.data.dto.CharacterDTO

interface MarvelRepository {

    suspend fun getAllCharacter(offset: Int): CharacterDTO
}