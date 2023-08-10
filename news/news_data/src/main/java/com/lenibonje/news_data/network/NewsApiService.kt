package com.lenibonje.news_data.network

import com.lenibonje.common_util.Constants
import com.lenibonje.news_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    // https://newsapi.org/v2/everything?q=tesla&from=2023-07-10&sortBy=publishedAt&apiKey=da18f6f7abae4139b8c88f5b0d17b73e#

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String,
        @Query("category") category: String =  Constants.CATEGORY,
        @Query("apiKey") apiKey: String = Constants.API_KEY,
    ): NewsResponse

}