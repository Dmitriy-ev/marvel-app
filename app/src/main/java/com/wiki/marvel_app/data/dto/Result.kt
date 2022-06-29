package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName
import com.wiki.marvel_app.domain.model.Character

data class Result(
    @SerializedName("comics")
    val comics: Comics,
    @SerializedName("description")
    val description: String,
    @SerializedName("events")
    val events: Events,
    @SerializedName("id")
    val id: Int, // 1011334
    @SerializedName("modified")
    val modified: String, // 2014-04-29T14:18:17-0400
    @SerializedName("name")
    val name: String, // 3-D Man
    @SerializedName("resourceURI")
    val resourceURI: String, // http://gateway.marvel.com/v1/public/characters/1011334
    @SerializedName("series")
    val series: Series,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("urls")
    val urls: List<Url>
)
