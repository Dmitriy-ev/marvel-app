package com.wiki.marvel_app.data.dto

data class Series(
    val available: Int, // 3
    val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/series
    val items: List<ItemXXX>,
    val returned: Int // 3
)
