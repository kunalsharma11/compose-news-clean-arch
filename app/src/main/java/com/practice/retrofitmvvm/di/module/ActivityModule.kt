package com.practice.retrofitmvvm.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.practice.retrofitmvvm.data.repository.TopHeadlineRepository
import com.practice.retrofitmvvm.di.ActivityContext
import com.practice.retrofitmvvm.ui.base.ViewModelProviderFactory
import com.practice.retrofitmvvm.ui.newsapi.EverythingNewsApiAdapter
import com.practice.retrofitmvvm.ui.newsapi.EverythingNewsApiViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

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

    @Provides
    fun provideTopHeadlineAdapter() = EverythingNewsApiAdapter(ArrayList())
}