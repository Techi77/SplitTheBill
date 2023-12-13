package com.example.splitthebill.StartPage.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.splitthebill.databinding.FStartBinding

class StartFragment: Fragment() {
    private lateinit var binding: FStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FStartBinding.inflate(inflater, container, false)
        return binding.root
    }

}