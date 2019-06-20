package com.example.truckstatuskotlin.DataTruck

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.truckstatuskotlin.R
import kotlinx.android.synthetic.main.fragment_before_item.view.*


import java.util.ArrayList

class DataTruckAdapter(internal var context: Context, resource: Int, objects: List<DataTruck>) :
    ArrayAdapter<DataTruck>(context, resource, objects) {

    internal var dataTruck: List<DataTruck> = ArrayList()

    init {
        this.dataTruck = objects
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val _dataTruckItem = LayoutInflater.from(context).inflate(
            R.layout.fragment_before_item, parent, false
        )
        val _date = _dataTruckItem.item_date
        val _time = _dataTruckItem.item_time
        val _numberTkk = _dataTruckItem.item_numberTkk
        val _licensePlate = _dataTruckItem.item_license
        val _carNumber = _dataTruckItem.item_carNumber
        val _row = dataTruck[position]
        _date.setText(_row.date)
        _time.setText(_row.time)
        _carNumber.setText(_row.carNummber.toString())
        _licensePlate.setText(_row.licensePlate)
        _numberTkk.setText(_row.numberTkk)
        return _dataTruckItem
    }
}
