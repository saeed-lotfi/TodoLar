package com.bilgiland.localstorage.entity

import java.util.*

data class TodoEntity(
    val todoId: Int,
    val title: String,
    val isDone: Boolean,
    val date: Date
)