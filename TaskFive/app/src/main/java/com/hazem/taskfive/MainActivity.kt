package com.hazem.taskfive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var email=findViewById<TextInputEditText>(R.id.et_mail)
        var password=findViewById<TextInputEditText>(R.id.et_internal_password)
        var loginButton=findViewById<Button>(R.id.btn_login)
        var registerButton=findViewById<Button>(R.id.btn_register)
        loginButton.setOnClickListener {
          if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){

             /* val intent = Intent(this, TestActivity::class.java)
              intent.putExtra("keyString", "Logged")
             startActivity(intent)*/
           Intent(this,HomeActivity::class.java).also {
               startActivity(it)
               finish()
           }

           }
        }
        registerButton.setOnClickListener {
                Intent(this,RegisterActivity::class.java).also {
                    startActivity(it)
                    finish()
                }

        }
    }
}