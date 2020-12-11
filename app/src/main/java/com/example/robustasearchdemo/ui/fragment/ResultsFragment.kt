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
import com.example.robustasearchdemo.ui.viewmodel.MainViewModel

class ResultsFragment : Fragment() {

    private lateinit var mBinding: FragmentResultsBinding
    private lateinit var mMainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_results, container, false)
        mMainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        return mBinding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = ResultsFragment()
    }
}