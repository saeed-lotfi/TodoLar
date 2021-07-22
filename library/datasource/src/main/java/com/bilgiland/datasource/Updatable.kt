package com.bilgiland.datasource

interface Updatable<I> {
    suspend fun update(input: I)

    interface IO<I, O> {
        suspend fun update(input: I): O
    }
}