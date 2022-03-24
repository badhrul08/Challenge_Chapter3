package com.binar.challenge_personal_badhrulsalman

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import com.binar.challenge_personal_badhrulsalman.databinding.FragmentScreen2Binding

lateinit var nameInfo : String

class Screen2Fragment : Fragment() {

    private lateinit var binding: FragmentScreen2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentScreen2Binding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnScreen2.setOnClickListener {
            nameInfo = binding.edtName.text.toString()
            val detailSecond = Detail(
                name = nameInfo
            )
            findNavController().navigate(Screen2FragmentDirections.actionScreen2FragmentToScreen3Fragment(detailSecond))
        }
    }

}