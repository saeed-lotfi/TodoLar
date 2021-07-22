package com.bilgiland.mapper

interface Mapper<I, O> {

    fun mapItem(input: I?): O
}