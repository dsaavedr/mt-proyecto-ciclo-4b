package com.example.storefrontapplication.data.repositories

import com.example.storefrontapplication.data.mocks.CommentMock
import com.example.storefrontapplication.data.models.Comment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CommentRepository(private val dataSource: CommentMock) {
    suspend fun loadComments(): List<Comment> {
        return withContext(Dispatchers.IO) {
            dataSource.loadComments()
        }
    }
}