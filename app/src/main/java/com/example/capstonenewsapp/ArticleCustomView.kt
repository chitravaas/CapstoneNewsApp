package com.example.capstonenewsapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.capstonenewsapp.databinding.ArticleViewBinding

class ArticleCustomView @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr:Int = 0, defStyleRes :Int = 0) :
    LinearLayout(context,attr, defStyleAttr, defStyleRes) {

      //  private  val binding = ArticleViewBinding.inflate(LayoutInflater.from(context),this)
      private  val binding =ArticleViewBinding.inflate(LayoutInflater.from(context),this, true)

    init {
        orientation = VERTICAL
    }

    fun setData(article: Article, onClickListener: () -> Unit ){
        //  fun setData(article: Article){
        setArticleTitle(article.title)
        setArticleAuthor(article.author)
        setArticleSource(article.source.name)
        setOnClickListener { onClickListener()}
    }

    private fun setArticleTitle(title : String){
        binding.titleId.text = title
    }

    private fun setArticleAuthor(author : String?){
        binding.authorId.text = author
    }

    private fun setArticleSource(sourceName :String) {
       binding.sourceName.text= sourceName
    }
}


