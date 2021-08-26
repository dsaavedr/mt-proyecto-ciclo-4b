package com.example.storefrontapplication

import android.app.Application
import com.example.storefrontapplication.di.dataSourceModel
import com.example.storefrontapplication.di.repoModule
import com.example.storefrontapplication.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules( listOf(dataSourceModel, repoModule, viewModelModule ))
        }
    }

}