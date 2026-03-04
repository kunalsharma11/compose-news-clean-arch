package com.practice.retrofitmvvm.di.component

import android.content.Context
import com.practice.retrofitmvvm.RetrofitMvvmApplication
import com.practice.retrofitmvvm.data.api.NetworkService
import com.practice.retrofitmvvm.data.repository.TopHeadlineRepository
import com.practice.retrofitmvvm.di.ApplicationContext
import com.practice.retrofitmvvm.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: RetrofitMvvmApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository
}