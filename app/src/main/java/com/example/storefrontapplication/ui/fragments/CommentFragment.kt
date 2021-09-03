package com.example.storefrontapplication.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.storefrontapplication.data.models.Comment
import com.example.storefrontapplication.databinding.FragmentCommentBinding
import com.example.storefrontapplication.ui.adapters.CommentAdapter
import com.example.storefrontapplication.ui.listeners.OnCommentListener
import com.example.storefrontapplication.ui.viewmodels.CommentViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class CommentFragment : Fragment() {

    private var _binding: FragmentCommentBinding? = null

    private val binding get() = _binding!!

    private val commentViewModel: CommentViewModel by viewModel()

    private lateinit var commentAdapter: CommentAdapter
    private lateinit var commentManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCommentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        commentViewModel.loadComments()
        commentAdapter = CommentAdapter(
            listOf()
        )

        commentAdapter.listener = object : OnCommentListener {
            override fun onClick(comment: Comment) {
                Log.d("click", comment.name!!)
                commentViewModel.selectProduct(comment)
            }
        }
        commentManager = LinearLayoutManager(requireContext())

        binding.commentRecycler.apply {
            adapter = commentAdapter
            layoutManager = commentManager
        }

        commentViewModel.comment.observe(viewLifecycleOwner, Observer { comments ->
            commentAdapter.newDataSet(comments)
        })
    }
}



