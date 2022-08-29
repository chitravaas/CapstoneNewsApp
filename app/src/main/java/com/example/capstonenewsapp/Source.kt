package com.example.capstonenewsapp

data class Source(val id:String? = null,
                  val name:String,
                  val description:String,
                  val url:String,
                  val category: String,
                  val language : String,
                  val country: String
)