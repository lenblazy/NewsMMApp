package com.lenibonje.news_presentation

import androidx.lifecycle.ViewModel
import com.lenibonje.news_domain.useCase.GetNewsArticleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase): ViewModel() {

    private val _newsArticle= MutableStateFlow(NewsState())
    val newsArticle = _newsArticle.asStateFlow()

    fun getNewsArticle(){
        getNewsArticleUseCase.
    }


}
