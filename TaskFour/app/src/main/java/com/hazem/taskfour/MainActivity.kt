package com.hazem.taskfour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_click_me.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}