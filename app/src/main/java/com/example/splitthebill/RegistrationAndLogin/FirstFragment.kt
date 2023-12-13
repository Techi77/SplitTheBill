package com.example.splitthebill.RegistrationAndLogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.splitthebill.MainActivity
import com.example.splitthebill.databinding.FFirstPageBinding

class FirstFragment: Fragment() {
    private lateinit var binding: FFirstPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FFirstPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginBt.setOnClickListener {
            (activity as? MainActivity)?.addFragment(LoginFragment())
        }
        binding.registrationBt.setOnClickListener {
            (activity as? MainActivity)?.addFragment(SingUpFragment())
        }
    }
}