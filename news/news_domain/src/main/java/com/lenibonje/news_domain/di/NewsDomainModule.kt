package com.lenibonje.news_domain.di

import com.lenibonje.news_domain.repository.NewsRepository
import com.lenibonje.news_domain.useCase.GetNewsArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object NewsDomainModule {

    @Provides
    fun getNewsArticleUseCase(newsRepository: NewsRepository): GetNewsArticleUseCase {
        return GetNewsArticleUseCase(newsRepository)
    }

}
