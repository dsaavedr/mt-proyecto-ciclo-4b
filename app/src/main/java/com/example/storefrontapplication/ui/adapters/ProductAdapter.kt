package com.example.storefrontapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.storefrontapplication.data.models.Product
import com.example.storefrontapplication.databinding.ItemProductBinding
import com.example.storefrontapplication.ui.listeners.OnProductListener

class ProductAdapter (var items: List<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    var listener: OnProductListener? = null

    class ViewHolder (val item: ItemProductBinding): RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = items[position]
        holder.item.productListName.text = product.name
        holder.item.productListPrice.text = product.price
        Glide.with(holder.itemView).load(product.image).into(holder.item.productListImage);

        holder.item.root.setOnClickListener {
            listener?.onClick(product)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun newDataSet(products: List<Product>) {
        items = products
        notifyDataSetChanged()
    }
}