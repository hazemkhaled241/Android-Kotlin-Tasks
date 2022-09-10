package com.hazem.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hazem.newsapp.Fragments.TechnologyFragment
import com.hazem.newsapp.Fragments.ScienceFragment
import com.hazem.newsapp.Fragments.SportsFragment
import com.hazem.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomNavigationView:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

      showFragment(SportsFragment("Sports"))
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       bottomNavigationView=binding.bottomNavigationView
        bottomNavigationView.setOnItemSelectedListener { item ->
        bottomNavigationView.menu.findItem(item.itemId).isChecked = true
            var fragment: Fragment? = null
            if (item.itemId == R.id.item_sports)
                fragment = SportsFragment("sports")
            else if (item.itemId == R.id.item_science)
                fragment = ScienceFragment("science")
            else if (item.itemId == R.id.item_policy)
                fragment = TechnologyFragment("technology")
            /*supportFragmentManager
                .beginTransaction()
                .replace(binding.frameLayout.id, fragment!!)
                .commit()*/
            if (fragment != null) {
                showFragment(fragment)
            }
            false
        }


    }

    private fun showFragment(fragment: Fragment){
      supportFragmentManager
          .beginTransaction()
          .replace(R.id.frameLayout,fragment)
          .commit()
    }
}