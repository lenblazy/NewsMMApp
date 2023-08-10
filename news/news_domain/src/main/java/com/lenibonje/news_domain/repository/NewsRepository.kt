package com.lenibonje.news_domain.repository

import com.lenibonje.news_domain.model.Article

interface NewsRepository {

    suspend fun getNewsArticle(): List<Article>

}
