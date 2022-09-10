package com.example.capstonenewsapp

import com.example.capstonenewsapp.models.CategoryType
import com.example.capstonenewsapp.models.CountryType
import com.example.capstonenewsapp.models.LanguageType

data class Source(val id:String? = null,
                  val name:String,
                  val description:String,
                  val url:String,
                  val category: CategoryType,
                  val language : LanguageType,
                  val country: CountryType,
)