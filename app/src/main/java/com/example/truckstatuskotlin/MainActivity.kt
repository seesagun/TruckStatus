package com.example.truckstatuskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textMessage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView : BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_view, LoginFragment())
                .commit()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_view, LoginFragment())
            .commit()
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage?.setText(R.string.title_home)
                val mainFragment = MainFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_view, mainFragment)
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_history -> {
                textMessage?.setText(R.string.title_history)
                val transactionFragment = TransactionFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_view, transactionFragment)
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
