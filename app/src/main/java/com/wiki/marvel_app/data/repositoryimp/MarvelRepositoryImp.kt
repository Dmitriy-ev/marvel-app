package com.wiki.marvel_app.data.repositoryimp

import com.wiki.marvel_app.data.dto.CharacterDTO
import com.wiki.marvel_app.data.network.MarvelApi
import com.wiki.marvel_app.data.network.RetrofitFactory
import com.wiki.marvel_app.domain.model.Character
import com.wiki.marvel_app.domain.model.mapToModel
import com.wiki.marvel_app.domain.repository.MarvelRepository
import retrofit2.Response

object MarvelRepositoryImp: MarvelRepository {

    override suspend fun getAllCharacter(): List<Character> {
        return RetrofitFactory.instance.charactersService.getAllCharacters().data.results.map { it.mapToModel() }
    }
}