package com.example.mekotlin4.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mekotlin4.data.local.room.converters.DateConverters
import com.example.mekotlin4.data.local.room.dao.NoteDao
import com.example.mekotlin4.data.local.room.entities.Note

abstract class AppDatabase : RoomDatabase() {
    abstract val noteDao: Unit

    @Database(entities = [Note ::class], version = 1, exportSchema = false)
    @TypeConverters(DateConverters::class)
    abstract class AppDatabase{
        abstract fun noteDao() : NoteDao
    }
}