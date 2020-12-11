package com.example.robustasearchdemo.ui.activity

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.robustasearchdemo.R
import com.example.robustasearchdemo.databinding.ActivityMainBinding
import com.example.robustasearchdemo.ui.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mMainViewModel: MainViewModel
    private lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mMainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setupViewModelObservations()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        mNavController = navHostFragment.navController

        handleSearchIntent(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)

        // Associate searchable configuration with the SearchView
        val searchManager = getSystemService(SEARCH_SERVICE) as SearchManager
        (menu?.findItem(R.id.search)?.actionView as SearchView).apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))

            val handler = Handler()
            setOnQueryTextListener(object : OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(query: String): Boolean {
                    handler.removeCallbacksAndMessages(null)
                    handler.postDelayed({
                        if (query.length >= MIN_NUM_OF_CHARS_TO_START_SEARCH) {
                            mMainViewModel.showResultsForQuery(query)
                        }
                    }, USER_TYPING_DELAY_PERIOD)
                    return false
                }
            })
        }
        return true
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleSearchIntent(intent)
    }

    private fun handleSearchIntent(intent: Intent) {
        if (Intent.ACTION_SEARCH == intent.action) {
            val query = intent.getStringExtra(SearchManager.QUERY)
            if (query!!.length >= MIN_NUM_OF_CHARS_TO_START_SEARCH) {
                mMainViewModel.showResultsForQuery(query)
            }
        }
    }

    private fun setupViewModelObservations() {
        mMainViewModel.getShowResultsFragmentLiveData().observe(this, {
            if (it == true && mMainViewModel.isResultsFragmentVisible() == false) {
                navigateToResultsFragment()
            }
        })
    }

    private fun navigateToResultsFragment() {
        mNavController.navigate(R.id.resultsFragment)
        mMainViewModel.setIsResultsFragmentVisibleLiveData(true)
    }

    companion object {
        const val USER_TYPING_DELAY_PERIOD: Long = 400
        const val MIN_NUM_OF_CHARS_TO_START_SEARCH = 3
    }
}