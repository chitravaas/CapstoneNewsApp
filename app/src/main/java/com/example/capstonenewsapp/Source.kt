package com.example.capstonenewsapp

import android.os.Parcelable
import com.example.capstonenewsapp.models.CategoryType
import com.example.capstonenewsapp.models.CountryType
import com.example.capstonenewsapp.models.LanguageType
import kotlinx.parcelize.Parcelize

@Parcelize data class Source(
    val id:String? = null,
    val name:String,
    val description:String,
    val url:String,
    val category: CategoryType,
    val language : LanguageType,
    val country: CountryType,
) : Parcelable