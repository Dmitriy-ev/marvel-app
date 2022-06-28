package com.wiki.marvel_app.data.dto

data class Data(
    val count: Int, // 1
    val limit: Int, // 20
    val offset: Int, // 0
    val results: List<Result>,
    val total: Int // 1
)
