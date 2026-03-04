package com.practice.retrofitmvvm.data.api

import com.practice.retrofitmvvm.data.model.EverythingEndpointResponse
import com.practice.retrofitmvvm.utils.AppConstants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {

    @Headers("X-Api-Key: $API_KEY")
    @GET("everything")
    suspend fun getEverything(@Query("q") query: String): EverythingEndpointResponse
}