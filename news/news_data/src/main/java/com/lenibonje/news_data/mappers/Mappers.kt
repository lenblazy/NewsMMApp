package com.lenibonje.news_data.mappers

import com.lenibonje.news_data.model.ArticleDTO
import com.lenibonje.news_domain.model.Article

fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author,
        content = this.content,
        description = this.description,
        title = this.title,
        urlToImage = this.urlToImage
    )
}