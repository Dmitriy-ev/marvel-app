package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class ItemEvents(
    @SerializedName("name")
    val name: String, // Secret Invasion
    @SerializedName("resourceURI")
    val resourceURI: String // http://gateway.marvel.com/v1/public/events/269
)
