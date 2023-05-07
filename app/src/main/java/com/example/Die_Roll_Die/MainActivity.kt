package com.example.Die_Roll_Die

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.Die_Roll_Dise.R

import java.util.*
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    private lateinit var iv1: ImageView
    private lateinit var iv2: ImageView
    private lateinit var Result:TextView
    private lateinit var roll_btn: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv1 = findViewById(R.id.iv1)
        iv2 = findViewById(R.id.iv2)
        roll_btn = findViewById(R.id.roll_btn)
        Result=findViewById(R.id.Result)




        roll_btn.setOnClickListener {
            rollDice()


        }

    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {

      val dice1=Random.nextInt(1,7)
        val dice2 = Random.nextInt(1, 7)
        val total = dice1 + dice2
        val diceImageRes1 = when (dice1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        val diceImageRes2 = when (dice2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        iv1.setImageResource(diceImageRes1)
        iv2.setImageResource(diceImageRes2)
        Result.visibility=View.VISIBLE

        Result.setText("You rolled $dice1 and $dice2 for a total =( $total!)")
        Toast.makeText(this, "You rolled $dice1 and $dice2 for a total of $total!", Toast.LENGTH_SHORT).show()

    }




    }

private fun TextView.visibility(visible: Int) {

}









