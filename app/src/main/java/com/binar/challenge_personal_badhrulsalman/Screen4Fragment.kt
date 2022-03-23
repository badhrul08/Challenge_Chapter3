package com.binar.challenge_personal_badhrulsalman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.binar.challenge_personal_badhrulsalman.databinding.FragmentScreen4Binding

class Screen4Fragment : Fragment() {

    private lateinit var binding: FragmentScreen4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentScreen4Binding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnScreen4.setOnClickListener {
            val fragmentManager : FragmentManager = parentFragmentManager
            val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
            val screen3Fragment = Screen3Fragment()
            val details = Detail(
                name = nameInfo,
                age = binding.editTextAge.text.toString().toInt(),
                address = binding.editTextAddress.text.toString(),
                job = binding.editTextJob.text.toString()
            )
            val bundle = Bundle()
            bundle.putParcelable("detail_info", details)
            screen3Fragment.arguments = bundle

            fragmentTransaction.replace(R.id.frame_layout_container, screen3Fragment, Screen3Fragment::class.java.simpleName)
            fragmentTransaction.commit()
        }
    }
}