package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {

    @Query("SELECT * FROM ToDoClass")
    fun getAllTodo() : LiveData<List<ToDoClass>>

    @Insert
    fun addTodo(todo : ToDoClass)

    @Query("DELETE FROM ToDoClass WHERE id = :id")
    fun deleteTodo(id : Int)
}