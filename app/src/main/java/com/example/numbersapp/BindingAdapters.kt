package com.example.numbersapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageResource")
fun setImageResource(imageView: ImageView, resourceId: Int) {
    imageView.setImageResource(resourceId)
}
