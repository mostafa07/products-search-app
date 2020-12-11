package com.example.robustasearchdemo.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.robustasearchdemo.data.model.Product
import com.example.robustasearchdemo.data.repository.ProductsRepository

class MainViewModel : ViewModel() {

    private var mIsResultsFragmentVisibleMutableLiveData: MutableLiveData<Boolean>
    private var mShowResultsFragmentMutableLiveData: MutableLiveData<Boolean>
    private var mProductsListMutableLiveData: MutableLiveData<List<Product>>

    init {
        mIsResultsFragmentVisibleMutableLiveData = MutableLiveData(false)
        mShowResultsFragmentMutableLiveData = MutableLiveData(false)
        mProductsListMutableLiveData = MutableLiveData()

        mProductsListMutableLiveData.value = ProductsRepository.getProductsList()
    }

    // Helper methods

    public fun showResultsForQuery(query: String) {
        if (mIsResultsFragmentVisibleMutableLiveData.value == false) {
            mShowResultsFragmentMutableLiveData.value = true
        }
    }

    // Getters and setters

    public fun isResultsFragmentVisible(): Boolean? {
        return mIsResultsFragmentVisibleMutableLiveData.value
    }

    public fun setIsResultsFragmentVisibleLiveData(isVisible: Boolean) {
        mIsResultsFragmentVisibleMutableLiveData.value = isVisible
    }

    public fun getShowResultsFragmentLiveData(): LiveData<Boolean> {
        return mShowResultsFragmentMutableLiveData
    }

    public fun getProductsListLiveData(): LiveData<List<Product>> {
        return mProductsListMutableLiveData
    }
}