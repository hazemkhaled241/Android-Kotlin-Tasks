package com.hazem.taskfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import java.util.Optional.of

import kotlin.math.log
import kotlin.collections.ArrayList as ArrayList1

class HomeActivity : AppCompatActivity() {

    private var list: ArrayList<String>? = null
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //val messages=mutableListOf<String>()
        Log.d("HomeActivity", "onCreate is called ")
        //window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        //val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        val cardView = findViewById<CardView>(R.id.button)
        val input = findViewById<EditText>(R.id.et_input_text)
        recyclerView = findViewById<RecyclerView>(R.id.rv_items)

        if (savedInstanceState != null) {
            list = savedInstanceState.getStringArrayList("test")!!
            Log.d("HomeActivity", list.toString())
            list?.let {
                if (it.isNotEmpty()) {
                    recyclerView.adapter = ItemsAdapter(it)
                    list = it
                    input.text.clear()
                }
            }
        }
        else{
            list = ArrayList<String>()
        }

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                applicationContext,
                LinearLayout.VERTICAL
            )
        )

        cardView.setOnClickListener {
            if (input.text.toString().isNotEmpty()) {
                list?.let {
                    it.add(input.text.toString())
                    recyclerView.adapter = ItemsAdapter(it)
                }
                input.text.clear()
            }





            //val inflater =layoutInflater
            // val view = inflater.inflate(R.layout.item,null)


        }

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("HomeActivity", "onRestart is called ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("HomeActivity", "onStart is called ")
    }

    override fun onPause() {

        super.onPause()
        Log.d("HomeActivity", "onPause is called ")
    }

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        outState.putStringArrayList("test", list)
        Log.d("HomeActivity", list.toString())
        Log.d("HomeActivity", "onSaveInstanceState is called ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("HomeActivity", "onStop is called ")
    }
    /* override fun onRestoreInstanceState(savedInstanceState: Bundle) {
         Log.d("HomeActivity", "onRestoreInstanceState is called ")
         var newList =savedInstanceState.getStringArrayList("test")
         recyclerView.adapter=ItemsAdapter(newList as ArrayList<String>)
         super.onRestoreInstanceState(savedInstanceState)
     }*/

    override fun onDestroy() {
        super.onDestroy()
        Log.d("HomeActivity", "oonDestroy is called ")
    }


}