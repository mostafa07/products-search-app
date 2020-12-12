package com.example.robustasearchdemo.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.robustasearchdemo.BR
import com.example.robustasearchdemo.R
import com.example.robustasearchdemo.data.model.Product

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    private var mData: MutableList<Product>

    init {
        mData = mutableListOf()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val viewDataBinding: ViewDataBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context), R.layout.item_product, parent, false
            )
        return ProductViewHolder(viewDataBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(mData[position])
    }

    override fun getItemCount(): Int = mData.size

    fun setData(data: List<Product>) {
        mData = data as MutableList<Product>
        notifyDataSetChanged()
    }

    fun clearData() {
        mData.clear()
        notifyDataSetChanged()
    }

    fun addItemList(newDataList: List<Product>) {
        mData.addAll(newDataList)
        notifyItemRangeInserted(mData.size - newDataList.size, newDataList.size)
    }

    inner class ProductViewHolder(private val mViewDataBinding: ViewDataBinding) :
        RecyclerView.ViewHolder(mViewDataBinding.root) {

        fun bind(product: Product) {
            mViewDataBinding.setVariable(BR.product, product)
            mViewDataBinding.executePendingBindings()
        }
    }
}