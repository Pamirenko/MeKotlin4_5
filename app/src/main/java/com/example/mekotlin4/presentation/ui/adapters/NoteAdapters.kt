package com.example.mekotlin4.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mekotlin4.data.models.NotesModel
import com.example.mekotlin4.databinding.NoteItemBinding

class NoteAdapters: RecyclerView.Adapter<NoteAdapters.NoteViewHolder>(){
    private var noteList= mutableListOf<NotesModel>()
    fun setNoteList(noteList : MutableList<NotesModel>){
    this.noteList = noteList}
    class NoteViewHolder(private val binding: NoteItemBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(notesModel: NotesModel){
            binding.litleNote.text = notesModel.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
           NoteItemBinding.inflate(LayoutInflater.from(parent.context))
       )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}