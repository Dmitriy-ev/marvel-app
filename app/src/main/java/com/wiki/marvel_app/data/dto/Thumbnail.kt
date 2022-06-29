package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("extension")
    val extension: String, // jpg
    @SerializedName("path")
    val path: String // http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784
)
