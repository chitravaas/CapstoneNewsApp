package com.example.capstonenewsapp

import com.example.capstonenewsapp.models.CategoryType
import com.example.capstonenewsapp.models.CountryType
import com.example.capstonenewsapp.models.LanguageType

class NewsService {

    private val sources = arrayListOf(
        Source(
            "business-insider",
            "Business Insider",
            "business",
            "http://businessinsider.com",
            CategoryType.BUSINESS,
            LanguageType.EN,
            CountryType.US,
        ),
        Source("", "info money", "https://infomoney.com", "business", CategoryType.BUSINESS, LanguageType.EN, CountryType.US),
        Source("fortune", "Fortune", "Fortune 500", "http://fortune.com",  CategoryType.BUSINESS, LanguageType.EN,  CountryType.US),
        Source("", "The Wall Street Journal", "WSJ", "http://wsj.com",  CategoryType.BUSINESS, LanguageType.EN,  CountryType.US),
        Source("", "The Wall Street Journal", "WSJ", "http://wsj.com",  CategoryType.BUSINESS, LanguageType.EN,  CountryType.US),
        Source("news", "Fox news", "News Updates", "http://foxnews.com",  CategoryType.BUSINESS, LanguageType.EN,  CountryType.US),
        Source("associated press", "Associated Press", "All News", "http://apnews.com",  CategoryType.GENERAL, LanguageType.EN,  CountryType.US),
        Source("Australian-financial-review", "Australian Financial Review", "AFR", "http://afr.com",  CategoryType.BUSINESS, LanguageType.EN,  CountryType.US),

        )
    //This fun will return an arraylist of Article
    fun returnArticles(): ArrayList<Article> {
        return arrayListOf(
            Article(
                sources[0],
                "CNN",
                "MTV Video",
                "Lizzo, Taylor Swift ",
                "https://www.cnn.com",
                "https://www.cnn.com",
            ),
            Article(
                sources[1],
                "Investors",
                "Busines Daily",
                "Dow Jones",
                "major indexes",
                "https://www.investors.com",
            ),
            Article(
                sources[2],
                "bbc news",
                "BBCnews",
                "columbia",
                "Around 16,00 people gathered",
                "\"https://www.investors.com",

            ),
            Article(
                sources[3],
                "",
                "bbc sports",
                "sports",
                "sports details",
                "http://www.bbc.com",
            ),
            Article(
                sources[0],
                "mtv",
                "Mat",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[5],
                "fox news",
                "Fox News",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[6],
                "associated press",
                "Associated Press",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[7],
                "australian financial review",
                "Australian Financial Review",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[2],
                "bbc news",
                "BBCnews",
                "columbia",
                "Around 16,00 people gathered",
                "\"https://www.investors.com",

                ),
            Article(
                sources[3],
                "",
                "bbc sports",
                "sports",
                "sports details",
                "http://www.bbc.com",
            ),
            Article(
                sources[0],
                "mtv",
                "Mat",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[5],
                "fox news",
                "Fox News",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[6],
                "associated press",
                "Associated Press",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),
            Article(
                sources[7],
                "australian financial review",
                "Australian Financial Review",
                "mtv director",
                "directior",
                "http://mtv.com",
            ),

        )
    }
}