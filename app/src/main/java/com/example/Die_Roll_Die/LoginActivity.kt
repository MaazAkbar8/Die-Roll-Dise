package com.example.Die_Roll_Die

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.Die_Roll_Dise.R


class LoginActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password:EditText
    private lateinit var btn:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // intialazation id
        email=findViewById(R.id.Email)
        password=findViewById(R.id.edPassword)
        btn=findViewById(R.id.button_register)

        //setonclicklistener

         btn.setOnClickListener {
             val Email = email.text.toString().trim()
             val Password = password.text.toString().trim()

             if  (Email.isEmpty()){
                 email.error = "please enter email"
                 return@setOnClickListener
             }
             if(Password.isEmpty()){
                 password.error="please enter password"
                 return@setOnClickListener
             }
             else{
                 val i=Intent(this, MainActivity::class.java)
                 startActivity(i)
                 finish()

             }
         }


    }
}