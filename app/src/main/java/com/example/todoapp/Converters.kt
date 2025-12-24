package com.example.todoapp

import androidx.room.TypeConverter
import java.util.Date

class Converters {

    @TypeConverter
    fun fromDate(date : Date) : Long{
        return date.time
    }
    @TypeConverter
    fun toDate(date : Long) : Date {
        return Date(date)
    }
}