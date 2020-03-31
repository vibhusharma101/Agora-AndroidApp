package com.aossie.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class MyViewPagerAdapter(var layouts:Array<Int>) : PagerAdapter() {

    private var layoutInflater:LayoutInflater?=null

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = container.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view = layoutInflater!!.inflate(layouts[position],container,false)
        container.addView(view)
        return view
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return (view ==`object`)
    }

    override fun getCount(): Int {
      return layouts!!.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        var view = `object` as View
        container.removeView(view)
    }



}