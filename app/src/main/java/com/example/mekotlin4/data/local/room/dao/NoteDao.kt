package com.example.mekotlin4.data.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mekotlin4.data.local.room.entities.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note_table")
    fun getAllNotes():List<Note>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNote(note: Note)

    @Update
    fun  deleteNote(note : Note)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNotes(notes: List <Note>)

    @Delete
    fun deleteNote1(note: Note)
    @Query("DELETE FROM note_table")
    fun clear ()


}