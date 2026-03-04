package com.practice.retrofitmvvm.data.model

import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String = "",
)


// We are expecting following API response
//{
//    "status": "ok",
//    "totalResults": 2,
//    "articles": [
//    {
//        "source": {
//        "id": null,
//        "name": "Cadillac"
//    },
//        "title": "Lyriq",
//        "description": "EV",
//        "url": "url1",
//        "urlToImage": "image1"
//    },
//    {
//        "source": {
//        "id": null,
//        "name": "Chevy"
//    },
//        "title": "Camaro",
//        "description": "ICE",
//        "url": "url2",
//        "urlToImage": "image2"
//    }
//    ]
//}