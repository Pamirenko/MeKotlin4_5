package com.example.mekotlin4.presentation.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mekotlin4.R
import com.example.mekotlin4.databinding.FragmentHomeBinding
import com.example.mekotlin4.presentation.ui.adapters.NoteAdapters
import com.example.mekotlin4.presentation.utils.App
import com.example.mekotlin4.presentation.utils.App.Companion.db


class HomeFragment : Fragment() {
    private val noteList: Any = db

    private lateinit var binding: FragmentHomeBinding
    private val noteAdapter = NoteAdapters()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    private fun getNotesFromRoom() {
       val noteList =  App.db.noteDao.getAllNotes()
        noteAdapter.setNoteList(noteList.toMutableList())
        noteAdapter.notifyDataSetChanged()

    }

    private fun navigateToAddNote() {
        binding.fabAdd.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragent_to_addNoteFragment)

        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        getNotesFromRoom()
        navigateToAddNote()
    }

    private fun initialize() {
        binding.rvNotes.adapter = noteAdapter
    }
}

