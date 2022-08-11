package com.hazem.Tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.hazem.getage.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btn_apply.setOnClickListener {
           val firstName=et_first_name.text.toString()
           val lastName=et_last_name.text.toString()
           val country=et_country.text.toString()
           val birthDate=et_birth_date.text.toString()
           Log.d("MainActivity", "My name is : $firstName $lastName " +
                   "and I'm living at $country and My birth date is $birthDate")
       }

    }
}