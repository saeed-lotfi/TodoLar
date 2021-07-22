package com.bilgiland.datasource

interface Writable<I> {
    suspend fun write(input: I)

    interface IO<I, O> {
        suspend fun write(input: I): O
    }
}