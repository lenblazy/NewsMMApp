package com.lenibonje.news_presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lenibonje.common_util.Resource
import com.lenibonje.news_domain.useCase.GetNewsArticleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase): ViewModel() {

    private val _newsArticle= MutableStateFlow(NewsState())
    val newsArticle = _newsArticle.asStateFlow()

    init {
        getNewsArticle()
    }

    fun getNewsArticle(){
        getNewsArticleUseCase().onEach {
            when(it){
                is Resource.Error -> _newsArticle.value = NewsState(error= it.message)
                is Resource.Loading -> _newsArticle.value = NewsState(isLoading = true)
                is Resource.Success -> _newsArticle.value = NewsState(data=it.data)
            }
        }.launchIn(viewModelScope)
    }


}
