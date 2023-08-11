package com.lenibonje.news_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.lenibonje.common_util.Navigator
import com.lenibonje.domain.R
import com.lenibonje.domain.databinding.ActivityNewsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NewsActivity : AppCompatActivity() {

    companion object{
        fun launchActivity(activity: Activity){
            val intent = Intent(activity, NewsActivity::class.java)
            activity.startActivity(intent)
        }
    }

    private val binding: ActivityNewsBinding by lazy { ActivityNewsBinding.inflate(layoutInflater) }

    private val viewModel by viewModels<NewsViewModel>()

    private val newsAdapter = NewsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        setObservers()
    }

    private fun initView() {
        binding.rvNews.adapter = newsAdapter
    }

    private fun setObservers() {
        lifecycleScope.launch {
            viewModel.newsArticle.collectLatest{
                if (it.isLoading){
                    binding.progressBar.visibility = View.VISIBLE
                }

                if (it.error.isNotBlank()){
                    binding.progressBar.visibility = View.GONE
                    Log.d("yow", "setObservers: ${it.error}")
                    Toast.makeText(this@NewsActivity, it.error, Toast.LENGTH_SHORT).show()
                }

                it.data?.let{ articles ->
                    binding.progressBar.visibility = View.GONE
                    Log.d("yow", "setObservers: $articles")
                    newsAdapter.setData(articles)
                }
            }
        }
    }
}

object GoToNewsActivity: Navigator {

    override fun navigate(activity: Activity) {
        NewsActivity.launchActivity(activity)
    }

}