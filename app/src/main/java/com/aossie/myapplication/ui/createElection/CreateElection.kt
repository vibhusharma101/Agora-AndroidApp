package com.aossie.myapplication.ui.createElection

import android.os.Bundle
import android.text.Html
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aossie.myapplication.R


class CreateElection : AppCompatActivity() {

    private var dotsLayout: LinearLayout?=null
    private var dots: Array<TextView> ?=null
    private val layouts: IntArray?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_election)
        dotsLayout =  findViewById(R.id.layoutDots)
        addBottomDots(0)

    }


    private fun addBottomDots(currentPage: Int) {
        dots = Array<TextView>(5){TextView(this)}
        val colorsActive = resources.getIntArray(R.array.array_dot_active)
        val colorsInactive = resources.getIntArray(R.array.array_dot_inactive)
        dotsLayout!!.removeAllViews()
        for (i in 0..2) {
            dots!![i] = TextView(this)
            dots!![i].text = Html.fromHtml("&#8226;")
            dots!![i].textSize = 35F
            dots!![i].setTextColor(colorsInactive[currentPage])
            dotsLayout!!.addView(dots!![i])
        }
        if (dots!!.isNotEmpty()) dots!![currentPage].setTextColor(colorsActive[currentPage])
    }



}

