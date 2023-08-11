package com.lenibonje.news_presentation

import com.lenibonje.news_domain.model.Article

data class NewsState(
    val isLoading: Boolean = false,
    val error: String = "",
    val data: List<Article>? = null
)
