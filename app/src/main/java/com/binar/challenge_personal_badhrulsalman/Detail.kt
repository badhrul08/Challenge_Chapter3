package com.binar.challenge_personal_badhrulsalman

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Detail(
    val name : String ?= null,
    val age : Int ?= null,
    val address : String ?= null ,
    val job : String ?= null
): Parcelable
