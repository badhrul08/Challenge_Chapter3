package com.binar.challenge_personal_badhrulsalman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.binar.challenge_personal_badhrulsalman.databinding.FragmentScreen3Binding

class Screen3Fragment : Fragment() {

    private lateinit var binding: FragmentScreen3Binding
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

        val dataName = arguments?.getString("Name")
        binding.txtYourName.text = dataName

        val dataDetail = arguments?.getParcelable<Detail>("detail_info")


        if (dataDetail != null){
            showDataDetail(dataDetail)
        }

        binding.btnScreen3.setOnClickListener {
            val fragmentManager : FragmentManager = parentFragmentManager
            val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
            val screen4Fragment = Screen4Fragment()

            fragmentTransaction.replace(R.id.frame_layout_container, screen4Fragment, Screen4Fragment::class.java.simpleName)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    private fun showDataDetail(detailData : Detail) {
        binding.txtYourName.visibility = View.INVISIBLE
        binding.detail.detailData.visibility = View.VISIBLE
        binding.detail.name.text = detailData.name
        binding.detail.address.text = detailData.address
        binding.detail.job.text = detailData.job

        if (detailData.age %2 == 0){
            age = "Usia Anda, Bernilai Genap"
        }else{
            age = "Usia Anda, Bernilai Ganjil"
        }

        binding.detail.age.text = age
    }

}