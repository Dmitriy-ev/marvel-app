package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class Stories(
    @SerializedName("available")
    val available: Int, // 21
    @SerializedName("collectionURI")
    val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/stories
    @SerializedName("items")
    val items: List<ItemStories>,
    @SerializedName("returned")
    val returned: Int // 20
)
