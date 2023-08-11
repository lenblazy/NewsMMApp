package com.lenibonje.newsmmapp

import android.content.Context
import com.lenibonje.common_util.Navigator
import com.lenibonje.news_data.room.NewsDAO
import com.lenibonje.newsmmapp.navigation.DefaultNavigator
import com.lenibonje.newsmmapp.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Provides
    @Singleton
    fun provideNavigatorProvider(): Navigator.Provider{
        return DefaultNavigator()
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context): AppDatabase{
        return AppDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideNewsDAO(appDatabase: AppDatabase): NewsDAO{
        return appDatabase.getNewsDao()
    }

}