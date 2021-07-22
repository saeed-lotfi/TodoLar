package com.bilgiland.localstorage.database.typeconverter

import androidx.room.TypeConverter
import java.util.*

class DateTypeConverter {

    @TypeConverter
    fun toDate(timestamp: Long): Date {
        return Date(timestamp)
    }

    @TypeConverter
    fun toTimeStamp(date: Date):Long
    {
        return date.time
    }
}