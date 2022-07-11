package com.wiki.marvel_app.data.network

import com.wiki.marvel_app.data.dto.CharacterDTO
import com.wiki.marvel_app.util.Constants
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelApi {

    @GET("/v{version}/public/characters")
    suspend fun getAllCharacters(
        @Path("version") version: Int = 1,
        @Query("apikey") apikey: String = Constants.API_KEY,
        @Query("ts") ts: String = Constants.timeStamp,
        @Query("hash") hash: String = Constants.hash(),
    ): CharacterDTO
}