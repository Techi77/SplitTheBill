package com.example.splitthebill.StartPage.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.splitthebill.databinding.ListFragmentLayoutBinding

class StartFragment: Fragment() {
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