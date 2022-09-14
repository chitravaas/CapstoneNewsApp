package com.example.capstonenewsapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.capstonenewsapp.databinding.ArticleDetailsBinding

class ArticleDetails @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr:Int = 0, defStyleRes :Int = 0) :
    LinearLayout(context,attr, defStyleAttr, defStyleRes) {

    //  private  val binding = ArticleViewBinding.inflate(LayoutInflater.from(context),this)
    private val binding = ArticleDetailsBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        orientation = VERTICAL
    }

    public fun setDetails(description : String){
        binding.articleDescription.text=description;
    }
}