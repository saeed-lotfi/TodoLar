package com.bilgiland.localstorage.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bilgiland.localstorage.database.dao.TodoEntityDao
import com.bilgiland.localstorage.database.entity.TodoDatabaseEntity
import com.bilgiland.localstorage.database.typeconverter.DateTypeConverter

@Database(entities = [TodoDatabaseEntity::class], version = 1)
@TypeConverters(DateTypeConverter::class)
internal abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoEntityDao
}