package com.binar.challenge_personal_badhrulsalman

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Detail(
    val name : String,
    val age : Int,
    val address : String,
    val job : String
): Parcelable
