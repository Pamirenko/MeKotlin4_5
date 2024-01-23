package com.example.mekotlin4.presentation.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mekotlin4.R
import com.example.mekotlin4.data.models.NotesModel
import com.example.mekotlin4.databinding.FragmentHomeBinding
import com.example.mekotlin4.presentation.ui.adapters.NoteAdapters
import com.example.mekotlin4.presentation.utils.App


class HomeFragment : Fragment() {
    private val noteList: Any
        get() {
            TODO()
        }
    private lateinit var binding: FragmentHomeBinding
    private val noteAdapter = NoteAdapters()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }



    private fun getNotesFromRoom() {
       val noteList = App.db.noteDao.getAllNote()
        this.noteList.addAll(noteList)
        noteAdapter.notifyDataSetChanged()
        this.noteList.addAll(noteList)
    }
    private fun navigateToAddNote(){
        binding.fabAdd.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragent_to_addNoteFragment)

        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupRecyclerView()
        getNotesFromRoom()
        navigateToAddNote()
    }

    private fun initialize() {
        noteAdapter.setNoteList(
            mutableListOf(
                NotesModel("Title", "Note", "Data \n time"),
                NotesModel("Title", "Note", "Data \n time"),
                NotesModel("Title", "Note", "Data \n time")
            )
        )
        binding.rvNotes.adapter = noteAdapter
    }
    private fun setupRecyclerView(){
        binding.rvNotes.adapter = noteAdapter
    }

}

private fun Unit.getAllNote(): Any {
    TODO("Not yet implemented")
}

private fun Any.addAll(noteList: Any) {
    TODO("Not yet implemented")
}
