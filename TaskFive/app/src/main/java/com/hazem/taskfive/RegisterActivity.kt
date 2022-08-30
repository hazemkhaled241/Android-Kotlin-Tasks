package com.hazem.taskfive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var registerButton = findViewById<Button>(R.id.btn_registration)
        var back = findViewById<Button>(R.id.btn_back)
        var email = findViewById<TextInputEditText>(R.id.et_register_mail)
        var password = findViewById<TextInputEditText>(R.id.et_register_internal_password)
        var confirmPassword = findViewById<TextInputEditText>(R.id.et_confirm_internal_password)
        registerButton.setOnClickListener {
            if (email.text.toString().isNotEmpty() && password.text.toString()
                    .isNotEmpty() && confirmPassword.text.toString().isNotEmpty()
            ) {


                if (password.text.toString() == confirmPassword.text.toString()) {
                    Intent(this, HomeActivity::class.java).also {
                        startActivity(it)
                        finish()
                    }
                }
            }
        }
        back.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}