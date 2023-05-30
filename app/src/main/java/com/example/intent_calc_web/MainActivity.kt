package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCALCULATOR:Button
    lateinit var ButtonINTENT:Button
    lateinit var ButtonWEB:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCALCULATOR=findViewById(R.id.Btn_calc)
        ButtonINTENT=findViewById(R.id.btn_intent)
        ButtonWEB=findViewById(R.id.Btn_web)
        ButtonCALCULATOR.setOnClickListener {
                val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
            ButtonINTENT.setOnClickListener {
                val intent=Intent(this,IntentActivity::class.java)
                startActivity(intent)

            }
            ButtonWEB.setOnClickListener {

                val intent=Intent(this,WebActivity::class.java)
                startActivity(intent)

            }

        }


        }


        }


