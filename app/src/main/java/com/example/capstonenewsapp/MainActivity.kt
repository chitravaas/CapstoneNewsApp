package com.example.capstonenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.children
import com.example.capstonenewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val sources = arrayListOf(
        Source(
            "business-insider",
            "Business Insider",
            "business",
            "http://businessinsider.com",
            "business",
            "en",
            "us"
        ),
        Source("", "info money", "https://infomoney.com", "business", "en", "us", "us"),
        Source("fortune", "Fortune", "Fortune 500", "http://fortune.com", "business", "en", "us"),
        Source("", "The Wall Street Journal", "WSJ", "http://wsj.com", "business", "en", "us"),
    )

    private val articles = returnArticles()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val mainGroup = binding.mainGroup

        var count = 0
        for (i in mainGroup.children) {
            if (i is TextView) {
                i.text = getContent(count)
            }
            count++
        }
    }
    //This fun will return each article data
    //Use default values in fun
    private fun getContent(count:Int=0): String {
        var content: String = ""
        if (articles[count].id != null) {
            content = articles[count].id!!
        }
        content += articles[count].name + articles[count].description
        return content;
    }

    //This fun will return an arraylist of Article
    private fun returnArticles(): ArrayList<Article> {
        return arrayListOf(
            Article(
                "cnn",
                "CNN",
                "Megan C",
                "MTV Video",
                "Lizzo, Taylor Swift ",
                "https://www.cnn.com",
                "\"https://cdn.cnn.com/cnnnext/dam/assets/220828195428-27-vmas-2022-red-carpet-taylor-swift-super-tease.jpg\"",
                "2022-08-29T06:24:34Z\"",
                "Megan C. Hills"
            ),
            Article(
                "",
                "Investors",
                "Busines Daily",
                "Dow Jones",
                "major indexes",
                "https://www.investors.com",
                "https://investors.com",
                "\"2022-08-29T06:24:453",
                "Dow Jones futures"
            ),
            Article(
                "",
                "bbc news",
                "BBCnews",
                "columbia",
                "Around 16,00 people gathered",
                "\"https://www.investors.com",
                "\"https://www.investors.com",
                "\"2022-08-29T06:24:432",
                "bbc news"
            ),
            Article(
                "",
                "",
                "bbc sports",
                "sports",
                "sports details",
                "http://www.bbc.com",
                "http://sports.com",
                "2021-08-29T06:24:432",
                "watch sports"
            ),
            Article(
                "",
                "mtv",
                "Mat",
                "mtv director",
                "directior",
                "http://mtv.com",
                "http://mtv.com",
                "2021-08-29T06",
                "mtv"
            )
        )
    }
}