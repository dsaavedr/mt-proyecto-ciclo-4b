package com.example.storefrontapplication.data.repositories

import com.example.storefrontapplication.data.mocks.ProductMock
import com.example.storefrontapplication.data.models.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository(private val dataSource: ProductMock) {
    suspend fun loadProducts(): List<Product> {
        return withContext(Dispatchers.IO) {
            dataSource.loadProducts()
        }
    }
}