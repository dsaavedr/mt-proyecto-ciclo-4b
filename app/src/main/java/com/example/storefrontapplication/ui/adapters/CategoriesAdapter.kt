package com.example.storefrontapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.storefrontapplication.data.models.Category
import com.example.storefrontapplication.databinding.ItemCategoryBinding
import com.example.storefrontapplication.ui.listeners.OnCategoryListener


class CategoriesAdapter (val items: List<Category>): RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {

    var listener: OnCategoryListener? = null

    class ViewHolder (val item: ItemCategoryBinding): RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder (
            ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categories = items[position]
        holder.item.categoryName.text = categories.name
        Glide.with(holder.itemView).load(categories.image).into(holder.item.categoryImage);

        holder.item.root.setOnClickListener {
            listener?.onClick(categories)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
}