package com.example.mekotlin4.presentation.utils

import android.app.Application
import androidx.room.Room
import com.example.mekotlin4.data.local.room.AppDatabase

private const val DATABASE_NAME = "note-database"

class App : Application() {
    companion object{
        lateinit var db : AppDatabase
        private set
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "DATABASE_NIME"
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
}