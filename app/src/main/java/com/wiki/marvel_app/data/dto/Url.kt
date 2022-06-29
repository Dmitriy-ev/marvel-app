package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class Url(
    @SerializedName("type")
    val type: String, // detail
    @SerializedName("url")
    val url: String // http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=3d51be48455680edcba3b530c5913db6
)
