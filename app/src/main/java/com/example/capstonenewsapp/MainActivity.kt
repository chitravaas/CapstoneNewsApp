package com.example.capstonenewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capstonenewsapp.ArticleDetailsActivity.Companion.INTENT_EXTRA_ARTICLE
import com.example.capstonenewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), onArticleTapListener {

    private lateinit var binding: ActivityMainBinding

    //Creating an object of NewsService and returning Articles
    private val newsService = NewsService()
    private val articles = newsService.returnArticles()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.articleRecyclerView.run {
            adapter=ArticleRecyclerAdapter(articles,this@MainActivity)
            layoutManager=LinearLayoutManager(this@MainActivity)
        }
    }

    //Tapping on VH of Recyclerview opens new Article Details screen
    override fun onTap(article: Article) {
        val intent = Intent(this, ArticleDetailsActivity::class.java)
        intent.putExtra(INTENT_EXTRA_ARTICLE, article)
        startActivity(intent)
    }
}