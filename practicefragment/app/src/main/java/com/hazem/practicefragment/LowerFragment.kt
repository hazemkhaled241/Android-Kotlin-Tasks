package com.hazem.practicefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class LowerFragment : Fragment(R.layout.fragment_lower) {
    private val args:LowerFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var textView=view.findViewById<TextView>(R.id.tv_counter)
        textView.text=args.test
    }
}