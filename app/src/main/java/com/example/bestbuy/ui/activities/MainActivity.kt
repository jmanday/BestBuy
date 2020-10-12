package com.example.bestbuy.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.example.bestbuy.R
import com.example.bestbuy.databinding.ActivityMainBinding
import com.example.bestbuy.listener.NavigationListener

class MainActivity : AppCompatActivity(), NavigationListener {

    private val navController by lazy { findNavController(R.id.nav_host_fragment) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
    }

    override fun onNavigationToDestination(actionId: Int) {
        navController.navigate(actionId)
    }

    override fun onNavigationToBack() {
        navController.navigateUp()
    }

    override fun onNavigationToNavDirections(navDirections: NavDirections) {
        navController.navigate(navDirections)
    }
}