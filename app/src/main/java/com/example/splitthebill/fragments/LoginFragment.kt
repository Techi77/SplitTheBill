package com.example.splitthebill.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.splitthebill.MainActivity
import com.example.splitthebill.databinding.LoginFragmentLayoutBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class LoginFragment: Fragment() {
    private lateinit var binding: LoginFragmentLayoutBinding
    private lateinit var firebaseAuth: FirebaseAuth
/*
    var editTextEmail: TextInputEditText? = null
    var editTextPassword: TextInputEditText? = null*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LoginFragmentLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.notSingUp.setOnClickListener {
            (activity as? MainActivity)?.addFragment(SingUpFragment())
        }

        binding.lgBt.setOnClickListener {
            val email = binding.email.editText.toString()
            val password = binding.password.editText.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {

                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        (activity as? MainActivity)?.addFragment(ListFragment())
                    } else {
                        //Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                //Toast.makeText(this, "Fields are empty ", Toast.LENGTH_SHORT).show()

            }
        }
    }
}