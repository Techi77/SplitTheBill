package com.example.splitthebill.startPage.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.splitthebill.R
import com.example.splitthebill.databinding.FCreateListDialogBinding

class CreateListDialogFragment: Fragment() {
    private lateinit var binding: FCreateListDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FCreateListDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goBt.setOnClickListener {
            findNavController().navigate(R.id.mainList)
        }
    }

}