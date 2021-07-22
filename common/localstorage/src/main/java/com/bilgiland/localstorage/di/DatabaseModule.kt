package com.bilgiland.localstorage.di

import android.content.Context
import androidx.room.Room
import com.bilgiland.localstorage.database.TodoDatabase
import com.bilgiland.localstorage.database.dao.TodoEntityDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {

    @Provides
    @Singleton
    fun createDatabase(@ApplicationContext context: Context): TodoDatabase {
        return Room.databaseBuilder(context, TodoDatabase::class.java, "todoDatabase").build()
    }

    @Singleton
    @Provides
    fun provideTodoEntity(todoDatabase: TodoDatabase): TodoEntityDao {
        return todoDatabase.todoDao()
    }

}