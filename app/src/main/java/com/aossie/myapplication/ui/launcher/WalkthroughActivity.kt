package com.aossie.myapplication.ui.launcher

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.aossie.myapplication.R
import com.aossie.myapplication.adapters.MyViewPagerAdapter


class WalkthroughActivity : AppCompatActivity() {

    private var viewPager: ViewPager?=null
    private var sliderDotsPanel : LinearLayout?=null
    private var dotsCount :Int =0
    private var dots : Array<ImageView> ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough)
        viewPager = findViewById(R.id.walkthroughViewPager)
        sliderDotsPanel = findViewById(R.id.dotsSliderWalkthrough)
        var layouts = arrayOf(R.layout.fragment_walk_through_one,R.layout.fragment_walk_through_two,R.layout.fragment_walk_through_three)
        var viewPagerAdapter:MyViewPagerAdapter  = MyViewPagerAdapter(layouts,this)
        viewPager!!.adapter = viewPagerAdapter
        dotsCount = viewPagerAdapter.count;
        dots  = Array<ImageView>(dotsCount) { ImageView(this) }
        for(i in 0 until dotsCount)
        {
            dots!![i].setImageDrawable(ContextCompat.getDrawable(applicationContext,R.drawable.non_active_dot))
            var params :LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(8,0,8,0)
            sliderDotsPanel!!.addView(dots!![i])
        }

        viewPager!!.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                for (i in 0 until dotsCount) {
                    dots!![i].setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.non_active_dot
                        )
                    )
                }
                dots!![position].setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.active_dot
                    )
                )
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })



    }
}
