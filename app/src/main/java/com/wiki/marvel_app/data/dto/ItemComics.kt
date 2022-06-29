package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class ItemComics(
    @SerializedName("name")
    val name: String, // Avengers: The Initiative (2007) #14
    @SerializedName("resourceURI")
    val resourceURI: String // http://gateway.marvel.com/v1/public/comics/21366
)
