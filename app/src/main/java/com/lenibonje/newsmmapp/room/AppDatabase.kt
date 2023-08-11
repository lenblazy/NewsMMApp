package com.lenibonje.newsmmapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lenibonje.news_data.room.NewsDAO

@Database(entities =[], version = 1, exportSchema = false, )
abstract class AppDatabase : RoomDatabase() {

    companion object {
        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context = context,
                klass = AppDatabase::class.java,
                name = "app_db"
            )
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun getNewsDao(): NewsDAO

}