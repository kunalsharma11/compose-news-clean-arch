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
        searchNews(AppConstants.EVERYTHING_ABOUT_BITCOIN)
    }

    fun searchNews(query: String) {
        if (query.isEmpty()) return
        
        _uiState.value = UiState.Loading
        viewModelScope.launch {
            topHeadlineRepository.getTopHeadlines(query)
                .catch { e ->
                    _uiState.value = UiState.Error(e.toString())
                }
                .collect {
                    _uiState.value = UiState.Success(it)
                }
        }
    }
}