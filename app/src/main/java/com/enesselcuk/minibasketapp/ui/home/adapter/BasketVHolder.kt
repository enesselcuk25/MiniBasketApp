package com.enesselcuk.minibasketapp.ui.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.enesselcuk.minibasketapp.databinding.ItemAdapterBinding
import com.enesselcuk.minibasketapp.source.remote.model.BasketResponseItem

class BasketVHolder(private val binding: ItemAdapterBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(
        basket: BasketResponseItem,
        basketClick: BasketAdapter.ClickToBasket
    ) {
        binding.setData = basket
        binding.click = basketClick
    }
}