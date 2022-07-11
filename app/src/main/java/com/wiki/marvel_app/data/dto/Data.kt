package com.wiki.marvel_app.data.dto

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("count")
    val count: Int, // 1
    @SerializedName("limit")
    val limit: Int, // 20
    @SerializedName("offset")
    val offset: Int, // 0
    @SerializedName("results")
    val results: ArrayList<Result>,
    @SerializedName("total")
    val total: Int // 1
)