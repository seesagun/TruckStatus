package com.example.truckstatuskotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import kotlinx.android.synthetic.main.fragment_transaction_history.view.*
import com.example.truckstatuskotlin.DataTruck.DataTruck
import com.example.truckstatuskotlin.DataTruck.DataTruckAdapter


import java.util.ArrayList

class TransactionFragment : Fragment() {

    internal var dataTrucks = ArrayList<DataTruck>()
    internal lateinit var _dataTruckList: ListView
    internal lateinit var _dataTruckAdapter: DataTruckAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_transaction_history, container, false)
    }

    override fun onActivityCreated(saveInstanceState: Bundle?) {
        super.onActivityCreated(saveInstanceState)

        _dataTruckList = view!!.findViewById(R.id.transaction_before_listing)
        dataTrucks.add(DataTruck("01/01/2562", "8:50", "ASDFJKL999", "9989", 3))
        dataTrucks.add(DataTruck("01/01/2562", "8:35", "ASDFJKL999", "9991", 2))
        dataTrucks.add(DataTruck("01/01/2562", "8:30", "ASDFJKL999", "9990", 1))
        dataTrucks.add(DataTruck("01/01/2562", "8:30", "JSSOJKK898", "1234", 1))
        dataTrucks.add(DataTruck("01/01/2562", "8:30", "EJKOIHJIJK9", "34321", 1))
        _dataTruckAdapter = DataTruckAdapter(
            activity!!.applicationContext,
            R.layout.fragment_before_item,
            dataTrucks
        )
        _dataTruckList.adapter = _dataTruckAdapter

        val _logoutText = view!!.check_pass_logout
        _logoutText.setOnClickListener(View.OnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.main_view, LoginFragment())
                .addToBackStack(null).commit()
            Log.d("USER", "GOTO Login Page")
        })


    }
}
