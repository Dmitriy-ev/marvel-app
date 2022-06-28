package com.wiki.marvel_app.data.dto

data class CharacterDTO(
    val attributionHTML: String, // <a href="http://marvel.com">Data provided by Marvel. © 2022 MARVEL</a>
    val attributionText: String, // Data provided by Marvel. © 2022 MARVEL
    val code: Int, // 200
    val copyright: String, // © 2022 MARVEL
    val `data`: Data,
    val etag: String, // f0f50f72d6ce5fc336cf70a7c2be616ce78215c8
    val status: String // Ok
)
