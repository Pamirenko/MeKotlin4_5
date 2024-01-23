package com.example.mekotlin4.data.local.room.converters

import androidx.room.TypeConverter
import java.util.Date

class DateConverters {
    @TypeConverter
    fun fromDate(value:Long): Date {
        return Date(value)
    }
    @TypeConverter
    fun toDate(date: Date):Long {
        return date.time
    }
}