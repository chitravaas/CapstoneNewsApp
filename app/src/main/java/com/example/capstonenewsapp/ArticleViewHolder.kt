package com.example.capstonenewsapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView


class ArticleViewHolder(
   private val articleView :ArticleCustomView
//private val binding: ArticleViewBinding
) : RecyclerView.ViewHolder(articleView) {

    /* fun bindData(article: Article, onDeleteTapped: () -> Unit){
        articleView.setData(article, onDeleteTapped)
    }*/

  /*  fun bindData(article: Article, onClickListener: () -> Unit){
         articleView.setData(article)
    }*/
   fun bindData(article: Article){
       articleView.setData(article)
    }



 /*fun bindData(article: Article) {
     articleView.setData(article)
 // binding.titleId.text=article.title
  //binding.authorId.text=article.author
  //binding.sourceName.text=article.source.name
 }*/

}