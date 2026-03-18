package com.example.numbersapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.numbersapp.databinding.ItemNumberBinding

class NumbersAdapter(private val items: List<NumberItem>) :
    RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>() {

    inner class NumberViewHolder(private val binding: ItemNumberBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: NumberItem) {
            binding.numberItem = item
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val binding = ItemNumberBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NumberViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
