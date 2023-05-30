package com.example.intent_calc_web

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class WebActivity : AppCompatActivity() {
    lateinit var webView: WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        webView = findViewById(R.id.webView)
        instagramweb()


    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun instagramweb(){
        webView.webViewClient= WebViewClient()
        webView.apply {
            loadUrl("https://www.instagram.com/")
            settings.javaScriptEnabled
            settings.safeBrowsingEnabled

        }
    }
}