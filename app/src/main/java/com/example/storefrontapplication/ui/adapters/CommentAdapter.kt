package com.example.storefrontapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.storefrontapplication.data.models.Comment
import com.example.storefrontapplication.databinding.ItemCommentBinding
import com.example.storefrontapplication.ui.listeners.OnCommentListener


class CommentAdapter (var items: List<Comment>): RecyclerView.Adapter<CommentAdapter.ViewHolder>() {

    var listener: OnCommentListener? = null

    class ViewHolder (val item: ItemCommentBinding): RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCommentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val comment = items[position]
        holder.item.commentName.text = comment.name
        holder.item.commentMessage.text = comment.message
        Glide.with(holder.itemView).load(comment.image).into(holder.item.commentImage);

        holder.item.root.setOnClickListener {
            listener?.onClick(comment)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun newDataSet(comments: List<Comment>) {
        items = comments
        notifyDataSetChanged()
    }
}