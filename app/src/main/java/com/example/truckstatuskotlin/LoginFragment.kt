package com.example.truckstatuskotlin

import android.content.res.AssetManager
import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(saveInstanceState: Bundle?) {
        super.onActivityCreated(saveInstanceState)


        val _loginBtn = view!!.findViewById<Button>(R.id.login_button)
        _loginBtn.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.main_view, MainFragment()).addToBackStack(null).commit()
            Log.d("USER", "GOTO MainMenu")
        }
    }
}
