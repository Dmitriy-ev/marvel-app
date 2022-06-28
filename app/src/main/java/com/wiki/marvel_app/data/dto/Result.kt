package com.wiki.marvel_app.data.dto

import com.wiki.marvel_app.domain.model.Character

data class Result(
    val comics: Comics,
    val description: String,
    val events: Events,
    val id: Int, // 1011334
    val modified: String, // 2014-04-29T14:18:17-0400
    val name: String, // 3-D Man
    val resourceURI: String, // http://gateway.marvel.com/v1/public/characters/1011334
    val series: Series,
    val stories: Stories,
    val thumbnail: Thumbnail,
    val urls: List<Url>
) {
    fun toCharacter(): Character {
        return Character(
            id = id,
            name = name,
            description = description,
            thumbnail = thumbnail.path,
            thumbnailExt = thumbnail.extension,
            comics = comics.items.map { it.name }

        )
    }
}
