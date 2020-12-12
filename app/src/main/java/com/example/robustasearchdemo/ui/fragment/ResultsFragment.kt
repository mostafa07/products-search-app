package com.example.robustasearchdemo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.robustasearchdemo.R
import com.example.robustasearchdemo.databinding.FragmentResultsBinding
import com.example.robustasearchdemo.ui.adapter.ProductAdapter
import com.example.robustasearchdemo.ui.viewmodel.MainViewModel

class ResultsFragment : Fragment() {

    private lateinit var mBinding: FragmentResultsBinding
    private lateinit var mMainViewModel: MainViewModel
    private lateinit var mProductsAdapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_results, container, false)

        setupViewModel()
        setupRecyclerView()
        setupViewModelObservations()

        return mBinding.root
    }

    private fun setupViewModel() {
        mMainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    private fun setupRecyclerView() {
        mProductsAdapter = ProductAdapter()
        mBinding.productsRecyclerView.adapter = mProductsAdapter
    }

    private fun setupViewModelObservations() {
        mMainViewModel.getProductsListLiveData().observe(requireActivity(), {
            mProductsAdapter.setData(it)
        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = ResultsFragment()
    }
}