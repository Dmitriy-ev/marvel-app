package com.wiki.marvel_app.data.repositoryimp

import com.wiki.marvel_app.data.dto.CharacterDTO
import com.wiki.marvel_app.data.network.MarvelApi
import com.wiki.marvel_app.domain.repository.MarvelRepository

object MarvelRepositoryImp: MarvelRepository {

    private lateinit var apiMarvel: MarvelApi

    override suspend fun getAllCharacter(offset: Int): CharacterDTO {
        return apiMarvel.getAllCharacters(offset = offset.toString())
    }
}