package com.example.intent_calc_web

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var Btn_sms: Button
    lateinit var Btn_call:Button
    lateinit var Btn_mpesa:Button
    lateinit var Btn_Dial: Button
    lateinit var Btn_Email: Button


    lateinit var Btn_share: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Btn_sms = findViewById(R.id.Btn_sms)
        Btn_call=findViewById(R.id.Btn_call)
        Btn_mpesa=findViewById(R.id.Btn_mpesa)
        Btn_Dial = findViewById(R.id.Btn_Dial)
        Btn_Email = findViewById(R.id.Btn_Email)


        Btn_share = findViewById(R.id.Btn_share)



        Btn_sms.setOnClickListener {
          val uri= Uri.parse("smsto:0740815350")
          val intent=Intent(Intent.ACTION_SENDTO,uri)
          intent.putExtra("Good Afternoon","How are you doing today")
          startActivity(intent)
        }
        Btn_call.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if(ContextCompat.checkSelfPermission(
            this@IntentActivity,
            Manifest.permission.CALL_PHONE
                )!=PackageManager.PERMISSION_GRANTED
            ){
                ActivityCompat.requestPermissions(
                    this@IntentActivity,

                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            }else{
                startActivity(intent)
            }
        }

        Btn_Dial.setOnClickListener {
            val phone = "0740815350"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        Btn_Email.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }


        Btn_share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }
        Btn_mpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }


    }
}


