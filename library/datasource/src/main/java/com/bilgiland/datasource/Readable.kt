package com.bilgiland.datasource

interface Readable<O> {
    fun read(): O

    interface IO<I, O> {
        fun read(input: I): O
    }
}