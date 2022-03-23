package com.binar.challenge_personal_badhrulsalman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToFragment1()
    }

    private fun goToFragment1(){
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        val screen1Fragment = Screen1Fragment()

        fragmentTransaction.add(R.id.frame_layout_container, screen1Fragment, Screen1Fragment::class.java.simpleName)
        fragmentTransaction.commit()
    }
}