package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class ItemSeries(
    @SerializedName("name")
    val name: String, // Avengers: The Initiative (2007 - 2010)
    @SerializedName("resourceURI")
    val resourceURI: String // http://gateway.marvel.com/v1/public/series/1945
)
