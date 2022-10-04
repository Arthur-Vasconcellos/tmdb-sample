package com.example.tmdb_sample.domain

import android.app.Application
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel


class TmdbSampleApplication: Application() {
//    val x = module {
//    }
    override fun onCreate() {
        super.onCreate()
        startKoin {
//            module(x)
        }
    }
}

