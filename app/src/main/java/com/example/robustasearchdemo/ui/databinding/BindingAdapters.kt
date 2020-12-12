package com.example.robustasearchdemo.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.robustasearchdemo.R

@BindingAdapter("imageResource")
fun setImage(imageView: ImageView, imageUrl: String?) {
    Glide.with(imageView.rootView.context)
        .setDefaultRequestOptions(
            RequestOptions()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
        )
        .load(imageUrl)
        .into(imageView)
}
