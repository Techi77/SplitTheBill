package com.example.splitthebill.RegistrationAndLogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.splitthebill.MainActivity
import com.example.splitthebill.StartPage.fragments.StartFragment
import com.example.splitthebill.databinding.FSignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SingUpFragment: Fragment() {
    private lateinit var binding: FSignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
/*
    var editTextEmail: TextInputEditText? = null
    var editTextPassword: TextInputEditText? = null*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.alreadySingUp.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(LoginFragment())
        }
        binding.button.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val password = binding.passET.text.toString()
            val confirmPass = binding.confirmPassEt.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (password == confirmPass) {

                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                        if (it.isSuccessful) {
                            (activity as? MainActivity)?.addFragment(StartFragment())
                        } else {
                            //Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
                } else {
                   Toast.makeText(context, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            } else {
               Toast.makeText(context, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

            }
        }

    }
}