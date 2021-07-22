package com.bilgiland.localstorage.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "todo_table")
internal data class TodoDatabaseEntity(
    @PrimaryKey(autoGenerate = true)
    val todoId: Int?,
    val title: String,
    val isDone: Boolean = false,
    val date: Date
)