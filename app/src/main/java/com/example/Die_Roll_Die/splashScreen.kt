package com.example.Die_Roll_Die

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.Die_Roll_Dise.R


class splashScreen : AppCompatActivity() {
    private lateinit var splash_image: ImageView
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)



        //delay post
        android.os.Handler().postDelayed({
        val i= Intent(this, Landing_Activity::class.java)
            startActivity(i)
            finish()
        },3000)


    }
}