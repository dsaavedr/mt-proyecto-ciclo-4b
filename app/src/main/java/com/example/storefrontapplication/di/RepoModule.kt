package com.example.storefrontapplication.di

import com.example.storefrontapplication.data.repositories.CommentRepository
import com.example.storefrontapplication.data.repositories.ProductRepository
import org.koin.dsl.module

val repoModule = module {
    single { ProductRepository(get()) }
    single { CommentRepository(get()) }
}