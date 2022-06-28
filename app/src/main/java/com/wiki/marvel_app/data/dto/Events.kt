package com.wiki.marvel_app.data.dto

data class Events(
    val available: Int, // 1
    val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/events
    val items: List<ItemXX>,
    val returned: Int // 1
)
