package com.lenibonje.news_domain.useCase

import com.lenibonje.common_util.Resource
import com.lenibonje.news_domain.model.Article
import com.lenibonje.news_domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNewsArticleUseCase(private val newsRepository: NewsRepository) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())

        try {
            emit(Resource.Success(newsRepository.getNewsArticle()))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }

    }

}