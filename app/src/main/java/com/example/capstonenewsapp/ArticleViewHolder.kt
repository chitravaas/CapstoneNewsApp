package com.example.capstonenewsapp

import androidx.recyclerview.widget.RecyclerView


class ArticleViewHolder(
   private val articleView :ArticleCustomView
) : RecyclerView.ViewHolder(articleView) {

   fun bindData(article: Article,onArticleTapped: () -> Unit){
       articleView.setData(article,onArticleTapped)
    }
}