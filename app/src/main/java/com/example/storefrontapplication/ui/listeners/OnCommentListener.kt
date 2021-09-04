package com.example.storefrontapplication.ui.listeners

import com.example.storefrontapplication.data.models.Comment

interface OnCommentListener {
    fun onClick(comment: Comment)
}