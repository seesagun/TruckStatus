package com.example.truckstatuskotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.truckstatuskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
}
