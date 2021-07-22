package com.bilgiland.localstorage.datasource

import com.bilgiland.datasource.Deletable
import com.bilgiland.datasource.Readable
import com.bilgiland.datasource.Updatable
import com.bilgiland.datasource.Writable
import com.bilgiland.functional.Failure
import com.bilgiland.functional.Response
import com.bilgiland.functional.Success
import com.bilgiland.localstorage.database.dao.TodoEntityDao
import com.bilgiland.localstorage.entity.TodoEntity
import com.bilgiland.localstorage.error.TodoError
import com.bilgiland.localstorage.mapper.TodoMapper
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

internal class TodoDataSource @Inject constructor(
    private val todoEntityDao: TodoEntityDao,
    private val todoMapper: TodoMapper
) : TodoDataSourceDeletable,
    TodoDataSourceWrite,
    TodoDataSourceUpdate,
    TodoDataSourceRead {

    override suspend fun delete(input: TodoEntity): Response<Unit, TodoError> {

        val todoDatabaseEntity = todoMapper.secondToFirst(input)
        val todoId = todoEntityDao.deleteTodo(todoDatabaseEntity)

        return if (todoId >= 0) {
            Success(Unit)
        } else
            Failure(TodoError.DeleteFailed)

    }

    override suspend fun write(input: TodoEntity): Response<Unit, TodoError> {
        val todoDatabaseEntity = todoMapper.secondToFirst(input)
        val todoId = todoEntityDao.insertTodo(todoDatabaseEntity)

        return if (todoId >= 0) {
            Success(Unit)
        } else
            Failure(TodoError.WritetFailed)

    }

    override suspend fun update(input: TodoEntity): Response<Unit, TodoError> {
        val todoDatabaseEntity = todoMapper.secondToFirst(input)
        val todoId = todoEntityDao.updateTodo(todoDatabaseEntity)

        return if (todoId >= 0) {
            Success(Unit)
        } else
            Failure(TodoError.UpdateFailed)
    }

    override fun read(input: Unit):Flow<TodoEntity> {
        val todosDatabase = todoEntityDao.getAll().map

    }

}

typealias TodoDataSourceDeletable = Deletable.IO<TodoEntity,
        @JvmSuppressWildcards Response<Unit, TodoError>>

typealias TodoDataSourceWrite = Writable.IO<TodoEntity,
        @JvmSuppressWildcards Response<Unit, TodoError>>

typealias TodoDataSourceUpdate = Updatable.IO<TodoEntity,
        @JvmSuppressWildcards Response<Unit, TodoError>>

typealias TodoDataSourceRead = Readable.IO<Unit,
        @JvmSuppressWildcards Flow<TodoEntity>>