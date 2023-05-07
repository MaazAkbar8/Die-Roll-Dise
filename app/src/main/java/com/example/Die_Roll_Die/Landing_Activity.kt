package com.example.Die_Roll_Die

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.Die_Roll_Dise.R

class Landing_Activity : AppCompatActivity() {
    private lateinit var btn_regiter:TextView
    private lateinit var btn_login:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

       btn_regiter=findViewById(R.id.btn_register)
        btn_login=findViewById(R.id.btn_Login)



     btn_regiter.setOnClickListener {
          val i=Intent(this, RegisterActivity::class.java)
         startActivity(i)
         finish()
     }
        btn_login.setOnClickListener {
            Toast.makeText(this,"please frist fill signUp",Toast.LENGTH_SHORT).show()
        }

    }
    }

