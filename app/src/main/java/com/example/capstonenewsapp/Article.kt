package com.example.capstonenewsapp

data class Article (val id:String?=null,
                    val name:String,
                    val author:String?=null,
                    val title:String,
                    val description:String?=null,
                    val url:String,
                    val urlToImage :String?=null,
                    val publishedAt:String,
                    val content:String?=null)