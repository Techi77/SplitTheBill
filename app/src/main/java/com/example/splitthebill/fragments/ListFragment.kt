package com.example.splitthebill.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.splitthebill.databinding.ListFragmentLayoutBinding

class ListFragment: Fragment() {
    private lateinit var binding: ListFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListFragmentLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

}