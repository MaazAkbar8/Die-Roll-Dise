package com.example.Die_Roll_Die

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.Die_Roll_Dise.R


class RegisterActivity : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var Register:TextView
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        name=findViewById(R.id.Name)
        email=findViewById(R.id.Email)
        password=findViewById(R.id.Password)
        Register=findViewById(R.id.btn_register)


        Register.setOnClickListener {
            val Name = name.text.toString().trim()
            val Email = email.text.toString().trim()
            val Password = password.text.toString().trim()
            val Register = Register.text.toString().trim()

            if (Name.isEmpty()) {
                name.error = "please enter a name"
                return@setOnClickListener
            }
            if  (Email.isEmpty()){
                email.error = "please enter email"
                return@setOnClickListener
            }
            if(Password.isEmpty()){
                password.error="please enter password"
                return@setOnClickListener
            }
          else{
              val i=Intent(this, LoginActivity::class.java)
                startActivity(i)
                finish()

            }

        }
    }
}