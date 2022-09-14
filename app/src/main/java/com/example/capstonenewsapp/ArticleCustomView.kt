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
      val articleDetails = ArticleDetails(context)

    init {
        orientation = VERTICAL
    }

  /*  fun setData(article: Article, onDeleteTapped: () -> Unit){
    //  fun setData(article: Article){
    setArticleTitle(article.title)
    setArticleAuthor(article.author)
    setArticleSource(article.source.name)
    setOnDeleteTappedCallback(onDeleteTapped)
    }*/
  //fun setData(article: Article, onClickListener: (String) -> Unit){

    fun setData(article: Article){
        //  fun setData(article: Article){
        setArticleTitle(article.title)
        setArticleAuthor(article.author)
        setArticleSource(article.source.name)
       // setOnClickListener(View.OnClickListener(article.source.description))
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

    private fun setOnDeleteTappedCallback(onDeleteTapped: () -> Unit){
        binding.deleteArticleButton.setOnClickListener{onDeleteTapped()}
    }

  /*  private fun setOnClickListener(onClickListener: (String) ){
     //   binding.deleteArticleButton.setOnClickListener{onDeleteTapped()}
        articleDetails.setDetails(description)
    }  */
}


