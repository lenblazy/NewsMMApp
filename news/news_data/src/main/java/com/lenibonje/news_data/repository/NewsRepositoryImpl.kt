package com.lenibonje.news_data.repository

import com.lenibonje.news_data.mappers.toDomainArticle
import com.lenibonje.news_data.network.NewsApiService
import com.lenibonje.news_data.room.NewsDAO
import com.lenibonje.news_domain.model.Article
import com.lenibonje.news_domain.repository.NewsRepository

class NewsRepositoryImpl(private val newsApiService: NewsApiService,
    private val newsDAO: NewsDAO): NewsRepository {

    override suspend fun getNewsArticle(): List<Article> {

        return try{
            val temp = newsApiService.getNewsArticles(country = "us").articles.map { it.toDomainArticle() }
            newsDAO.insertList(temp)
            newsDAO.getNewsArticle()
        }catch(e: Exception){
            newsDAO.getNewsArticle()
        }

    }


}
