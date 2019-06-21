package com.example.truckstatuskotlin

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class LoginFragment : Fragment() {

    // Bottom Hide
    private var navigationView: BottomNavigationView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(saveInstanceState: Bundle?) {
        super.onActivityCreated(saveInstanceState)

        navigationView = activity?.window?.decorView?.findViewById(R.id.nav_view)
        navigationView?.visibility = View.INVISIBLE


        val _loginBtn = view!!.findViewById<Button>(R.id.login_button)
        _loginBtn.setOnClickListener {
            navigationView = activity?.window?.decorView?.findViewById(R.id.nav_view)
            navigationView?.visibility = View.VISIBLE
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.main_view, MainFragment()).addToBackStack(null).commit()
            Log.d("USER", "GOTO MainMenu")
        }
    }
}
