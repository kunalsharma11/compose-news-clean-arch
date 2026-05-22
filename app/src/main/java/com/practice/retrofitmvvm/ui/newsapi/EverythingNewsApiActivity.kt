package com.practice.retrofitmvvm.ui.newsapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.practice.retrofitmvvm.RetrofitMvvmApplication
import com.practice.retrofitmvvm.di.component.DaggerActivityComponent
import com.practice.retrofitmvvm.di.module.ActivityModule
import com.practice.retrofitmvvm.ui.theme.NewsAppTheme
import javax.inject.Inject

class EverythingNewsApiActivity : ComponentActivity() {

    @Inject
    lateinit var everythingNewsApiViewModel: EverythingNewsApiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                NewsApiScreen(viewModel = everythingNewsApiViewModel)
            }
        }
    }

    private fun injectDependencies() {
        DaggerActivityComponent.builder()
            .applicationComponent((application as RetrofitMvvmApplication).applicationComponent)
            .activityModule(ActivityModule(this)).build().inject(this)
    }
}