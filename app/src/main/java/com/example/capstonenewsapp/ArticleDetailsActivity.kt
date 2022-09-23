package com.example.capstonenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capstonenewsapp.databinding.ActivityArticleDetailsBinding

class ArticleDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityArticleDetailsBinding.inflate(layoutInflater)
        val view = setContentView(binding.root)

        val article =intent.getParcelableExtra<Article>(INTENT_EXTRA_ARTICLE)
        binding.articleDescription.text=article?.source?.description
    }

    companion object{
        const val  INTENT_EXTRA_ARTICLE ="ARTICLEINPUT"
    }

}