package com.example.truckstatuskotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.truckstatuskotlin.DataTruck.DataTruck
import kotlinx.android.synthetic.main.fragment_check_pass.view.*


import java.util.ArrayList

class MainFragment : Fragment() {
    internal var dataTrucks = ArrayList<DataTruck>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_check_pass, container, false)
    }

    override fun onActivityCreated(saveInstanceState: Bundle?) {
        super.onActivityCreated(saveInstanceState)
        val _logoutText = view!!.check_pass_logout

        _logoutText.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.main_view, LoginFragment()).addToBackStack(null).commit()
            Log.d("USER", "GOTO Login Page")
        }
    }
}
