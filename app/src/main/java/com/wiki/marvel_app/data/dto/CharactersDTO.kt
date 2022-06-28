//package com.wiki.marvel_app.data.dto
//
//import com.wiki.marvel_app.domain.model.Character
//
//data class CharactersDTO(
//    val attributionHTML: String, // <a href="http://marvel.com">Data provided by Marvel. © 2022 MARVEL</a>
//    val attributionText: String, // Data provided by Marvel. © 2022 MARVEL
//    val code: Int, // 200
//    val copyright: String, // © 2022 MARVEL
//    val data: Data,
//    val etag: String, // f0f50f72d6ce5fc336cf70a7c2be616ce78215c8
//    val status: String // Ok
//) {
//    data class Data(
//        val count: Int, // 1
//        val limit: Int, // 20
//        val offset: Int, // 0
//        val results: List<Result>,
//        val total: Int // 1
//    ) {
//        data class Result(
//            val comics: Comics,
//            val description: String,
//            val events: Events,
//            val id: Int, // 1011334
//            val modified: String, // 2014-04-29T14:18:17-0400
//            val name: String, // 3-D Man
//            val resourceURI: String, // http://gateway.marvel.com/v1/public/characters/1011334
//            val series: Series,
//            val stories: Stories,
//            val thumbnail: Thumbnail,
//            val urls: List<Url>
//        ) {
//            data class Comics(
//                val available: Int, // 12
//                val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/comics
//                val items: List<Item>,
//                val returned: Int // 12
//            ) {
//                data class Item(
//                    val name: String, // Avengers: The Initiative (2007) #14
//                    val resourceURI: String // http://gateway.marvel.com/v1/public/comics/21366
//                )
//            }
//
//            data class Events(
//                val available: Int, // 1
//                val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/events
//                val items: List<Item>,
//                val returned: Int // 1
//            ) {
//                data class Item(
//                    val name: String, // Secret Invasion
//                    val resourceURI: String // http://gateway.marvel.com/v1/public/events/269
//                )
//            }
//
//            data class Series(
//                val available: Int, // 3
//                val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/series
//                val items: List<Item>,
//                val returned: Int // 3
//            ) {
//                data class Item(
//                    val name: String, // Avengers: The Initiative (2007 - 2010)
//                    val resourceURI: String // http://gateway.marvel.com/v1/public/series/1945
//                )
//            }
//
//            data class Stories(
//                val available: Int, // 21
//                val collectionURI: String, // http://gateway.marvel.com/v1/public/characters/1011334/stories
//                val items: List<Item>,
//                val returned: Int // 20
//            ) {
//                data class Item(
//                    val name: String, // Cover #19947
//                    val resourceURI: String, // http://gateway.marvel.com/v1/public/stories/19947
//                    val type: String // cover
//                )
//            }
//
//            data class Thumbnail(
//                val extension: String, // jpg
//                val path: String // http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784
//            )
//
//            data class Url(
//                val type: String, // detail
//                val url: String // http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=3d51be48455680edcba3b530c5913db6
//            )
//        }
//    }
//
//    fun toCharacter(): Character {
//        return Character(
//            id = CharactersDTO.Data.Result()
//        )
//    }
//}