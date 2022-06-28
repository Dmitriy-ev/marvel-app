package com.wiki.marvel_app.data.dto

data class Comics(
    val available: Int, // 12
    val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/comics
    val items: List<ItemX>,
    val returned: Int // 12
)
