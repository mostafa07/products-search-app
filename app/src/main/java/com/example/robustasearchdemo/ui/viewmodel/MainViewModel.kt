package com.example.robustasearchdemo.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mIsResultsFragmentVisibleMutableLiveData: MutableLiveData<Boolean>
    private var mShowResultsFragmentMutableLiveData: MutableLiveData<Boolean>

    init {
        mIsResultsFragmentVisibleMutableLiveData = MutableLiveData(false)
        mShowResultsFragmentMutableLiveData = MutableLiveData(false)
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
}