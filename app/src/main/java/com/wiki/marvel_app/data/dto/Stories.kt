package com.wiki.marvel_app.data.dto

data class Stories(
    val available: Int, // 21
    val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/stories
    val items: List<ItemStories>,
    val returned: Int // 20
)
