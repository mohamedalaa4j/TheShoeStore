package com.mohamedalaa4j.theshoestore

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Shoe(var name: String, var size: Double, var company: String, var description: String,
                val images: List<String> = mutableListOf()) : Parcelable