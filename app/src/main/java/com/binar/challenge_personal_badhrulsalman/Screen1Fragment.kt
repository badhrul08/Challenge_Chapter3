package com.binar.challenge_personal_badhrulsalman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.binar.challenge_personal_badhrulsalman.databinding.FragmentScreen1Binding

class Screen1Fragment : Fragment() {

    private lateinit var binding: FragmentScreen1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentScreen1Binding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnScreen1.setOnClickListener {
            findNavController().navigate(Screen1FragmentDirections.actionScreen1FragmentToScreen2Fragment())
        }
    }

}