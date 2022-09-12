package com.example.capstonenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capstonenewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //Creating an object of NewsService and returning Articles
    private val newsService = NewsService()
    private val articles = newsService.returnArticles()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        articles.forEach{ article ->
            val articleView=ArticleCustomView(this)
            articleView.setData(article)
            binding.mainGroup.addView(articleView)
        }
    }
}