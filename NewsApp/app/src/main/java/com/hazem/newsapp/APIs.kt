package com.hazem.newsapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIs {
@GET("v2/top-headlines?apiKey=2e0f2766004d4d9ebcfadbba0d89305e")
open fun getNews(
    @Query("country") country: String?,
    @Query("category") category: String?
): Call<News?>?

}
//v2/top-headlines?country=us&category=business&apiKey=2e0f2766004d4d9ebcfadbba0d89305e