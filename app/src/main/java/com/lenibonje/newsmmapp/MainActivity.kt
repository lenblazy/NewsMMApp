package com.lenibonje.newsmmapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lenibonje.common_util.Navigator
import com.lenibonje.newsmmapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var provider: Navigator.Provider

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}
