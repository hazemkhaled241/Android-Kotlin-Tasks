package com.hazem.newsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Articles
import com.hazem.newsapp.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class ScienceFragment (private var category:String): Fragment() {
    var scienceCategory:String?=null
     var list= arrayListOf<Articles>()
    val adapter:NewsItemAdapter by lazy {
        NewsItemAdapter(list)
    }
    init {
        scienceCategory=category

    }
  //private var binding:FragmentScienceBinding?=null
    //private val _binding get()=binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_science, container, false)
        //binding= FragmentScienceBinding.inflate(inflater,container,false)
        //return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var retrofit= RetrofitClient().getRetrofit()
        val recyclerView = view as RecyclerView
        var apIs: APIs = retrofit!!.create(APIs::class.java)
        apIs.getNews("eg", scienceCategory)?.enqueue(object: Callback, retrofit2.Callback<News?> {
            override fun onResponse(call: Call<News?>, response: Response<News?>) {
                list=response.body()!!.articles
                recyclerView.adapter =adapter

                  //  NewsItemAdapter()
            }

            override fun onFailure(call: Call<News?>, t: Throwable) {
                println(t.localizedMessage)
            }
        })
    }


}