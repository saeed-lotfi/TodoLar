package com.bilgiland.localstorage.database.dao

import androidx.room.*
import com.bilgiland.localstorage.database.entity.TodoDatabaseEntity
import kotlinx.coroutines.flow.Flow


@Dao
internal interface TodoEntityDao {

    @Insert(entity = TodoDatabaseEntity::class)
    suspend fun insertTodo(todoDatabase: TodoDatabaseEntity): Long

    @Query("select * from todo_table where isDone = 0")
    fun getAllNotDone(): Flow<List<TodoDatabaseEntity>>

    @Query("select * from todo_table")
    fun getAll(): Flow<List<TodoDatabaseEntity>>

    @Delete
    suspend fun deleteTodo(todoDatabase: TodoDatabaseEntity): Int

    @Delete
    suspend fun deleteTodo(todoDatabase: List<TodoDatabaseEntity>): Int

    @Update(entity = TodoDatabaseEntity::class)
    suspend fun updateTodo(todoDatabase: TodoDatabaseEntity): Int
}