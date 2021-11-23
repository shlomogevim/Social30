package com.sg.social30

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.sg.social30.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    private val onNavigationItemSelectedListener =
                         BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                textView.text="Home"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_search -> {
                textView.text="Search"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_add_post -> {
                textView.text="Add Post"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notification -> {
                textView.text="Notification"
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                textView.text="Profile"
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       nav_view.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)










        // navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

       /* binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

      /*  val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)*/
    }


}