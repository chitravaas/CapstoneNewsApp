package com.example.capstonenewsapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class ArticleRecyclerAdapter(
    articleList: List<Article>,
    private val listener: onArticleTapListener
): Adapter<ArticleViewHolder>() {
    private val articles = articleList.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val articleView = ArticleCustomView(parent.context)
        articleView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        return ArticleViewHolder(articleView)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
       holder.bindData(articles[position]){
           listener.onTap(articles[position])
       }
    }

    override fun getItemCount(): Int {
        return articles.size
    }
}