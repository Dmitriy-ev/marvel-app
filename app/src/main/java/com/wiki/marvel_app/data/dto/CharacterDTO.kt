package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class CharacterDTO(
    @SerializedName("attributionHTML")
    val attributionHTML: String, // <a href="http://marvel.com">Data provided by Marvel. © 2022 MARVEL</a>
    @SerializedName("attributionText")
    val attributionText: String, // Data provided by Marvel. © 2022 MARVEL
    @SerializedName("code")
    val code: Int, // 200
    @SerializedName("copyright")
    val copyright: String, // © 2022 MARVEL
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("etag")
    val etag: String, // f0f50f72d6ce5fc336cf70a7c2be616ce78215c8
    @SerializedName("status")
    val status: String // Ok
)
