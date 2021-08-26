package com.example.storefrontapplication.di

import com.example.storefrontapplication.data.mocks.ProductMock
import org.koin.dsl.module

val dataSourceModel = module {
    single { ProductMock() }
}