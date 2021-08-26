package com.example.storefrontapplication.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.storefrontapplication.data.models.Product
import com.example.storefrontapplication.data.repositories.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val repo: ProductRepository ): ViewModel() {
    private var products: MutableLiveData<List<Product>> = MutableLiveData()
    val product: LiveData<List<Product>> get() = products

    private var _selected: MutableLiveData<Product> = MutableLiveData()
    val selected: LiveData<Product> get() = _selected

    fun loadProducts() {
        viewModelScope.launch {
            products.postValue(repo.loadProducts())
        }
    }

    fun selectProduct(product: Product) {
        _selected.postValue(product)
    }
}