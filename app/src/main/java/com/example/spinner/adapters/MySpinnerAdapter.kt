package com.example.spinner.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.spinner.databinding.ItemSpinnerBinding
import com.example.spinner.models.MyFlags

class MySpinnerAdapter( var list : ArrayList<MyFlags>):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val itemSpinnerBinding = ItemSpinnerBinding.inflate(LayoutInflater.from(p2?.context), p2, false)
        itemSpinnerBinding.imageItem.setImageResource(list[p0].image)
        itemSpinnerBinding.tvName.text = list[p0].title
        return itemSpinnerBinding.root

    }

}