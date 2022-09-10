package com.hazem.newsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hazem.newsapp.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class TechnologyFragment(var category:String) : Fragment() {
    var technologyCategory:String?=null
    private lateinit var recyclerView: RecyclerView
    init {
        technologyCategory=category

    }
    //private var _binding: FragmentPolicyBinding? = null
   // private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     return inflater.inflate(R.layout.fragment_policy, container, false)
    //_binding=FragmentPolicyBinding.inflate(inflater, container, false)
     //   return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view as RecyclerView
        var retrofit= RetrofitClient().getRetrofit()

        var apIs: APIs = retrofit!!.create(APIs::class.java)
        apIs.getNews("eg", technologyCategory)?.enqueue(object: Callback, retrofit2.Callback<News?> {
            override fun onResponse(call: Call<News?>, response: Response<News?>) {
                recyclerView.adapter = NewsItemAdapter(response.body()!!.articles)
            }

            override fun onFailure(call: Call<News?>, t: Throwable) {
                println(t.localizedMessage)
            }
        })




    }

}