package com.hazem.tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btn_order.setOnClickListener {
        val checkButtonID= radioGroup.checkedRadioButtonId
        val checkedButtonView=findViewById<RadioButton>(checkButtonID)
        val cheese=cb_cheese.isChecked
        val onions=cb_onions.isChecked
        val salad=cb_salad.isChecked
        val fullOrder="You ordered a burger with: \n" +
                "${checkedButtonView.text}" +
                (if(cheese)"\ncheese" else "")+
                (if(onions)"\nonions" else "")+
                (if(salad)"\nsalad" else "")
        tv_full_order.text=fullOrder.toString()
    }
    }
}