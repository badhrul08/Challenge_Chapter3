package com.binar.challenge_personal_badhrulsalman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.binar.challenge_personal_badhrulsalman.databinding.FragmentScreen3Binding

class Screen3Fragment : Fragment() {

    private lateinit var binding: FragmentScreen3Binding
    private val arguments: Screen3FragmentArgs by navArgs()
    private var age = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentScreen3Binding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val dataName = arguments.detailParcelable.name
        binding.txtYourName.text = dataName

        if (arguments.detailParcelable.age != null && arguments.detailParcelable.address != null
            && arguments.detailParcelable.job != null){
            showDataDetail()
        }

        binding.btnScreen3.setOnClickListener {
            findNavController().navigate(Screen3FragmentDirections.actionScreen3FragmentToScreen4Fragment())
        }
    }

    private fun showDataDetail() {
        binding.txtYourName.visibility = View.INVISIBLE
        binding.detail.detailData.visibility = View.VISIBLE
        binding.detail.name.text = arguments.detailParcelable.name
        binding.detail.address.text = arguments.detailParcelable.address
        binding.detail.job.text = arguments.detailParcelable.job

        if (arguments.detailParcelable.age!! % 2 == 0){
            age = "Usia Anda, Bernilai Genap"
        }else{
            age = "Usia Anda, Bernilai Ganjil"
        }

        binding.detail.age.text = age
    }

}