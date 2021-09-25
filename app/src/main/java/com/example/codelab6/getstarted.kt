package com.example.codelab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener

class getstarted : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var homeFragment: HomeFragment
    lateinit var searchFragment: SearchFragment
    lateinit var favoritesFragment: FavoritesFragment



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        val textView = findViewById<TextView>(R.id.helloUser_txt)
        val intent = getIntent()
        val msg = intent.getStringExtra("name")
        textView.setText("Hello "+msg +"!" )

       // val bottomNavigationView = findViewById(R.id.navigation_view_bottom)
       // navigation_view_bottom.setOnNavigationItemSelectedListener(this)

    }
        override fun onNavigationItemSelected(item: MenuItem):Boolean{
        when(item.itemId){
            R.id.navi_home->{
                Toast.makeText(this,"Clicked Favorites",Toast.LENGTH_SHORT).show()

            }
            R.id.navi_favorites->{
                Toast.makeText(this,"Clicked Home",Toast.LENGTH_SHORT).show()
                favoritesFragment = FavoritesFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container_frame,homeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .addToBackStack(null)
                    .commit()
            }
            R.id.navi_search->{
                Toast.makeText(this,"Clicked Search",Toast.LENGTH_SHORT).show()
                searchFragment = SearchFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container_frame,homeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .addToBackStack(null)
                    .commit()
            }
        }
        return true
    }
}