package com.example.storefrontapplication.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.storefrontapplication.data.models.Comment
import com.example.storefrontapplication.data.repositories.CommentRepository
import kotlinx.coroutines.launch

class CommentViewModel(private val repo: CommentRepository): ViewModel() {
    private var comments: MutableLiveData<List<Comment>> = MutableLiveData()
    val comment: LiveData<List<Comment>> get() = comments

    private var _selected: MutableLiveData<Comment> = MutableLiveData()
    val selected: LiveData<Comment> get() = _selected

    fun loadComments() {
        viewModelScope.launch {
            comments.postValue(repo.loadComments())
        }
    }

    fun selectProduct(comment: Comment) {
        _selected.postValue(comment)
    }
}