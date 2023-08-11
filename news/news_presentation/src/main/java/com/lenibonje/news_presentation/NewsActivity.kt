package com.lenibonje.news_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lenibonje.common_util.Navigator
import com.lenibonje.domain.R
import com.lenibonje.domain.databinding.ActivityNewsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsActivity : AppCompatActivity() {

    companion object{
        fun launchActivity(activity: Activity){
            val intent = Intent(activity, NewsActivity::class.java)
            activity.startActivity(intent)
        }
    }

    private val binding: ActivityNewsBinding by lazy { ActivityNewsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}

object GoToNewsActivity: Navigator {

    override fun navigate(activity: Activity) {
        NewsActivity.launchActivity(activity)
    }

}