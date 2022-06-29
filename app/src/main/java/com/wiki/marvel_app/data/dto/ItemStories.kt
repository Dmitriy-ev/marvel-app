package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class ItemStories(
    @SerializedName("name")
    val name: String, // Cover #19947
    @SerializedName("resourceURI")
    val resourceURI: String, // http://gateway.marvel.com/v1/public/stories/19947
    @SerializedName("type")
    val type: String // cover
)
