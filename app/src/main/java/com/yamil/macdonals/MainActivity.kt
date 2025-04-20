package com.yamil.macdonals

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.yamil.macdonals.databinding.ActivityMainBinding

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