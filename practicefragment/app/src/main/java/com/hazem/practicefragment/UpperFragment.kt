package com.hazem.practicefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class UpperFragment : Fragment(R.layout.fragment_upper) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       val action=UpperFragmentDirections.actionUpperFragmentToLowerFragment("test")
       findNavController().navigate(action)
    }
}