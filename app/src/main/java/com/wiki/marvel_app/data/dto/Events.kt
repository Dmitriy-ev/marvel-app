package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("available")
    val available: Int, // 1
    @SerializedName("collectionURI")
    val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/events
    @SerializedName("items")
    val items: List<ItemEvents>,
    @SerializedName("returned")
    val returned: Int // 1
)
