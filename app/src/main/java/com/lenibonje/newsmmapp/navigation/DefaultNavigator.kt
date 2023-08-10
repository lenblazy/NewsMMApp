package com.lenibonje.newsmmapp.navigation

import com.lenibonje.common_util.Activities
import com.lenibonje.common_util.Navigator
import com.lenibonje.news_presentation.GoToNewsActivity
import com.lenibonje.search_presentation.GoToSearchActivity

class DefaultNavigator: Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when(activities){
            Activities.NewsActivity -> { GoToNewsActivity }
            Activities.SearchActivity -> { GoToSearchActivity }
        }
    }

}
