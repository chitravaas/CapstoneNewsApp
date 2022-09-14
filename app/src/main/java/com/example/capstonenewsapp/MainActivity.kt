package com.example.capstonenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonenewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
  //  lateinit var articlesRecyclerView: RecyclerView

    //Creating an object of NewsService and returning Articles
    private val newsService = NewsService()
    private val articles = newsService.returnArticles()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.articleRecyclerView.run {
            adapter=ArticleRecyclerAdapter(articles)
            layoutManager=LinearLayoutManager(this@MainActivity)
        }
    }
}