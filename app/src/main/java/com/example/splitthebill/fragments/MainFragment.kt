package com.example.splitthebill.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.splitthebill.MainActivity
import com.example.splitthebill.databinding.MainFragmentLayoutBinding

class MainFragment: Fragment() {
    private lateinit var binding: MainFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mainLoginBt.setOnClickListener {
            (activity as? MainActivity)?.addFragment(LoginFragment())
        }
        binding.mainRegistrationBt.setOnClickListener {
            (activity as? MainActivity)?.addFragment(SingUpFragment())
        }
    }
}