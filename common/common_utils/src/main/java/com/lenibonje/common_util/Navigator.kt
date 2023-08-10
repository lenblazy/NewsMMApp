package com.lenibonje.common_util

import android.app.Activity

interface Navigator {

    fun navigate(activity: Activity)

    interface Provider{
        fun getActivities(activities: Activities): Navigator
    }

}
