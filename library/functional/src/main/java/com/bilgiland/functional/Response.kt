package com.bilgiland.functional

sealed class Response<out V, out E>
    data class Success<V>(val value: V) : Response<V, Nothing>()
    data class Failure<E>(val error: E) : Response<Nothing, E>()