package com.yamil.macdonals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.yamil.macdonals.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()

    }

    private fun initUI() {
        initNavigatin()
    }

    private fun initNavigatin() {
        val navHost:NavHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentcontainerview) as NavHostFragment
        navController=navHost.navController

        binding.bottomNavView.setupWithNavController(navController)
    }
}