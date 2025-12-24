package com.example.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [ToDoClass::class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase(){

    companion object{
        const val NAME = "Todo_DB"
    }

    abstract fun getTodoDao() : TodoDao
}