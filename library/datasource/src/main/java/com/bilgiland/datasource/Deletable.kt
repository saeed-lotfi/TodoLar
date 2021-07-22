package com.bilgiland.datasource

interface Deletable<I> {
    suspend fun delete(input: I)

    interface IO<I, O> {
        suspend fun delete(input: I): O
    }
}