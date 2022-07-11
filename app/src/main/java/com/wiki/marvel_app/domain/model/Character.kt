package com.wiki.marvel_app.domain.model

import com.wiki.marvel_app.data.dto.Result

data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val thumbnail: String? = null,
    val thumbnailExt: String? = null,
    val comics: List<String>
)

fun Result.mapToModel(): Character {
    return Character(
        id = this.id,
        name = this.name,
        description = this.description,
        thumbnail = thumbnail.path,
        thumbnailExt = thumbnail.extension,
        comics = comics.items.map { it.name }
    )
}

