package com.aossie.myapplication.ui.launcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import android.widget.ImageView
import com.aossie.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var agoraLogoImageView : ImageView  = findViewById(R.id.agora_logo_main)
        var rotateAnimation: Animation =AnimationUtils.loadAnimation(baseContext,R.anim.rotate)
        var fadeAnimation:Animation = AnimationUtils.loadAnimation(baseContext,R.anim.fade_out_anim)

            agoraLogoImageView.startAnimation(rotateAnimation)


    }
}
