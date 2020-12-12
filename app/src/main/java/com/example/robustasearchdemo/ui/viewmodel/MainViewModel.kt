package com.example.robustasearchdemo.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.robustasearchdemo.data.model.Product
import com.example.robustasearchdemo.data.repository.ProductsRepository

class MainViewModel : ViewModel() {

    private var mIsResultsFragmentVisibleMutableLiveData: MutableLiveData<Boolean>
    private var mShowResultsFragmentMutableLiveData: MutableLiveData<Boolean>
    private var mIsLoadMoreButtonVisibleMutableLiveData: MutableLiveData<Boolean>
    private var mSearchQueryMutableLiveData: MutableLiveData<String>
    private var mProductsListMutableLiveData: MutableLiveData<List<Product>>

    init {
        mIsResultsFragmentVisibleMutableLiveData = MutableLiveData(false)
        mShowResultsFragmentMutableLiveData = MutableLiveData(false)
        mIsLoadMoreButtonVisibleMutableLiveData = MutableLiveData(true)
        mSearchQueryMutableLiveData = MutableLiveData()
        mProductsListMutableLiveData = MutableLiveData()

        mProductsListMutableLiveData.value = ProductsRepository.getProductsList()
    }

    // Helper methods

    public fun showResultsForQuery(loadMore: Boolean = false) {
        if (mIsResultsFragmentVisibleMutableLiveData.value == false) {
            mShowResultsFragmentMutableLiveData.value = true
        }

        val filteredProductsList = ProductsRepository.getProductsList()
            .filter { it.name.contains(mSearchQueryMutableLiveData.value.toString(), true) }
            .take(
                if (loadMore) NUM_OF_PRODUCTS_TO_FETCH_AFTER_LOAD_MORE.toInt()
                else NUM_OF_PRODUCTS_TO_FETCH.toInt()
            )

        if (filteredProductsList.isEmpty()) {
            mProductsListMutableLiveData.value = mutableListOf()
        } else {
            mProductsListMutableLiveData.value = filteredProductsList
        }
    }

    public fun loadMoreResults() {
        showResultsForQuery(true)
        mIsLoadMoreButtonVisibleMutableLiveData.value = false
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

    public fun isLoadMoreButtonVisibleLiveData(): LiveData<Boolean> {
        return mIsLoadMoreButtonVisibleMutableLiveData
    }

    public fun setSearchQueryLiveData(query: String) {
        mSearchQueryMutableLiveData.value = query
        showResultsForQuery()
        mIsLoadMoreButtonVisibleMutableLiveData.value = true
    }

    public fun getProductsListLiveData(): LiveData<List<Product>> {
        return mProductsListMutableLiveData
    }

    companion object {
        const val NUM_OF_PRODUCTS_TO_FETCH: Short = 10
        const val NUM_OF_PRODUCTS_TO_FETCH_AFTER_LOAD_MORE: Short = 20
    }
}