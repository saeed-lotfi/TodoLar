package com.bilgiland.localstorage.mapper

import com.bilgiland.localstorage.database.entity.TodoDatabaseEntity
import com.bilgiland.localstorage.entity.TodoEntity
import com.bilgiland.mapper.Mapper
import javax.inject.Inject

internal class TodoMapper @Inject constructor() : Mapper<TodoDatabaseEntity, TodoEntity> {
    override fun firstToSecond(firstItem: TodoDatabaseEntity): TodoEntity {
        return TodoEntity(
            todoId = firstItem.todoId ?: 0,
            title = firstItem.title,
            isDone = firstItem.isDone,
            date = firstItem.date
        )
    }

    override fun secondToFirst(secondItem: TodoEntity): TodoDatabaseEntity {
        return TodoDatabaseEntity(
            todoId = secondItem.todoId,
            title = secondItem.title,
            isDone = secondItem.isDone,
            date = secondItem.date
        )
    }

}