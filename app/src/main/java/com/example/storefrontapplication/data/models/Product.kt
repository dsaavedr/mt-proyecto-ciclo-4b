package com.example.storefrontapplication.data.models

data class Product (
    val image: String,
    val name: String,
    val price: String,
    val description: String = ""
)