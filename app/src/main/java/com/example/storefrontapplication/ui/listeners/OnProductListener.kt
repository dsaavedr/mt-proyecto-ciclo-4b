package com.example.storefrontapplication.ui.listeners

import com.example.storefrontapplication.data.models.Product

interface OnProductListener {
    fun onClick(product: Product)
}