package com.binar.challenge_personal_badhrulsalman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
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
            val fragmentManager : FragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            val screen3Fragment = Screen3Fragment()
            val bundle = Bundle()
            nameInfo = binding.edtName.text.toString()

            bundle.putString("Name", nameInfo)
            screen3Fragment.arguments = bundle

            fragmentTransaction.replace(R.id.frame_layout_container, screen3Fragment, Screen3Fragment::class.java.simpleName)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

}