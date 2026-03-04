package com.practice.retrofitmvvm.di.component

import com.practice.retrofitmvvm.di.ActivityScope
import com.practice.retrofitmvvm.di.module.ActivityModule
import com.practice.retrofitmvvm.ui.newsapi.EverythingNewsApiActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: EverythingNewsApiActivity)
}