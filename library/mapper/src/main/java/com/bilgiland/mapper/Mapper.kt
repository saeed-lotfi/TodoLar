package com.bilgiland.mapper

interface Mapper<First, Second> {

    fun firstToSecond(firstItem: First): Second

    fun secondToFirst(secondItem: Second): First

}