package com.rodrimu.api3mtesting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat

class ProductAdapter : ListAdapter<Product, ProductAdapter.ProductViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Product>() {
            override fun areItemsTheSame(oldItem: Product, newItem: Product) = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: Product, newItem: Product) = oldItem == newItem
        }
    }

    inner class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Product) {
            itemView.findViewById<TextView>(R.id.idText).text = "ID: ${item.id}"
            itemView.findViewById<TextView>(R.id.nombreText).text = item.name
            itemView.findViewById<TextView>(R.id.descripcionText).text = item.description
            itemView.findViewById<TextView>(R.id.precioText).text = "Precio: ${item.price}$"
            itemView.findViewById<TextView>(R.id.divisaText).text = "Moneda: ${item.currency}"
            val enStockTextView = itemView.findViewById<TextView>(R.id.enStockText)
            if (item.in_stock) {
                enStockTextView.text = "En stock"
                enStockTextView.setTextColor(ContextCompat.getColor(itemView.context, R.color.stock_green))
            } else {
                enStockTextView.text = "Sin stock"
                enStockTextView.setTextColor(ContextCompat.getColor(itemView.context, R.color.stock_red))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ProductViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
    )

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

