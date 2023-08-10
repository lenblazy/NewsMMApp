package com.lenibonje.newsmmapp

import com.lenibonje.common_util.Navigator
import com.lenibonje.newsmmapp.navigation.DefaultNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
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

}