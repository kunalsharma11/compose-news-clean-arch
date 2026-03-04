package com.practice.retrofitmvvm.data.model

import com.google.gson.annotations.SerializedName

data class EverythingEndpointResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("totalResults")
    val totalResults: Int = 0,
    @SerializedName("articles")
    val articles: List<Article> = ArrayList(),
)
