package com.example.mekotlin4.presentation.ui.fragment.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.mekotlin4.R
import com.example.mekotlin4.databinding.FragmentAddBlankBinding
import com.example.mekotlin4.databinding.FragmentHomeBinding

class AddBlankFragment : Fragment() {
    private var _binding : FragmentAddBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddBlankBinding.inflate(inflater,container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}

