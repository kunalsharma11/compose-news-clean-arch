package com.practice.retrofitmvvm.ui.newsapi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.practice.retrofitmvvm.data.model.Article
import com.practice.retrofitmvvm.data.repository.TopHeadlineRepository
import com.practice.retrofitmvvm.ui.base.UiState
import com.practice.retrofitmvvm.utils.AppConstants
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class EverythingNewsApiViewModel(private val topHeadlineRepository: TopHeadlineRepository): ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<Article>>>(UiState.Loading)

    val uiState: StateFlow<UiState<List<Article>>> = _uiState

    init {
        fetchTopHeadlines()
    }

    private fun fetchTopHeadlines() {
        viewModelScope.launch {
            topHeadlineRepository.getTopHeadlines(AppConstants.EVERYTHING_ABOUT_BITCOIN)
                .catch { e ->
                    _uiState.value = UiState.Error(e.toString())
                }
                .collect{
                    _uiState.value = UiState.Success(it)
                }
        }
    }
}