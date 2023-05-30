package com.example.intent_calc_web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Btn_answer: TextView
    lateinit var Btn_fmun: EditText
    lateinit var Btn_snum: EditText
    lateinit var Btn_add: Button
    lateinit var Btn_subtract: Button
    lateinit var Btn_divide: Button
    lateinit var Btn_multiply: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Btn_answer=findViewById(R.id.Btn_answer)
        Btn_fmun = findViewById(R.id.Btn_fnum)
        Btn_snum = findViewById(R.id.Btn_snum)
        Btn_add = findViewById(R.id.Btn_add)
        Btn_subtract = findViewById(R.id.Btn_subtract)
        Btn_divide = findViewById(R.id.Btn_divide)
        Btn_multiply = findViewById(R.id.Btn_multiply)


        Btn_add.setOnClickListener {
            val firstnum = Btn_fmun.text.toString()
            val secondnumber = Btn_snum.text.toString()
            if (firstnum.isEmpty() && secondnumber.isEmpty()) {

                Btn_answer.text = "Please fill all the details"
            } else {
                var answer = firstnum.toDouble() + secondnumber.toDouble()
                Btn_answer.text = answer.toString()

            }

        }

        Btn_subtract.setOnClickListener {
            val firstnum = Btn_fmun.text.toString()
            val secondnumber = Btn_snum.text.toString()
            if (firstnum.isEmpty() && secondnumber.isEmpty()) {

                Btn_answer.text = "Please fill all the details"
            } else {
                var answer = firstnum.toDouble() - secondnumber.toDouble()
                Btn_answer.text = answer.toString()
            }

        }
        Btn_multiply.setOnClickListener {
            val firstnum = Btn_fmun.text.toString()
            val secondnumber = Btn_snum.text.toString()
            if (firstnum.isEmpty() && secondnumber.isEmpty()) {

                Btn_answer.text = "Please fill all the details"
            } else {
                var answer = firstnum.toDouble() * secondnumber.toDouble()
                Btn_answer.text = answer.toString()
            }
        }
        Btn_divide.setOnClickListener {
            val firstnum = Btn_fmun.text.toString()
            val secondnumber = Btn_snum.text.toString()
            if (firstnum.isEmpty() && secondnumber.isEmpty()) {

                Btn_answer.text = "Please fill all the details"
            } else {
                var answer = firstnum.toDouble() / secondnumber.toDouble()
                Btn_answer.text = answer.toString()
            }
        }
    }
}

