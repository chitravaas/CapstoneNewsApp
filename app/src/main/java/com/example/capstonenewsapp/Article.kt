package com.example.capstonenewsapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class Article (
    val source: Source,
    val author:String?=null,
    val title:String,
    val urlToImage :String?=null,
    val publishedAt:String,
    val content:String?=null,): Parcelable