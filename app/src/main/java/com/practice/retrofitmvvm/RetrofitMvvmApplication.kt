package com.practice.retrofitmvvm

import android.app.Application
import com.practice.retrofitmvvm.di.component.ApplicationComponent
import com.practice.retrofitmvvm.di.component.DaggerApplicationComponent
import com.practice.retrofitmvvm.di.module.ApplicationModule

class RetrofitMvvmApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}