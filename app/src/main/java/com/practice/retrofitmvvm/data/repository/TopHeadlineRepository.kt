package com.practice.retrofitmvvm.data.repository

import com.practice.retrofitmvvm.data.api.NetworkService
import com.practice.retrofitmvvm.data.model.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService) {

    fun getTopHeadlines(everythingAboutBitcoin: String): Flow<List<Article>> {
        return flow {
            emit(networkService.getEverything(everythingAboutBitcoin))
        }.map {
            it.articles
        }
    }

}