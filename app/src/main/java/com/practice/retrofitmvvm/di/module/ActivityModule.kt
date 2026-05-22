package com.practice.retrofitmvvm.di.module

import android.content.Context
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.practice.retrofitmvvm.data.repository.TopHeadlineRepository
import com.practice.retrofitmvvm.di.ActivityContext
import com.practice.retrofitmvvm.ui.base.ViewModelProviderFactory
import com.practice.retrofitmvvm.ui.newsapi.EverythingNewsApiViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: ComponentActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideTopHeadlineViewModel(topHeadlineRepository: TopHeadlineRepository): EverythingNewsApiViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(EverythingNewsApiViewModel::class) {
                EverythingNewsApiViewModel(topHeadlineRepository)
            })[EverythingNewsApiViewModel::class.java]
    }
}