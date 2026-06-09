package com.example.webview

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.addCallback
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webViewVariable: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        webViewVariable = findViewById(R.id.webview)

        webViewSetup(webViewVariable)

        onBackPressedDispatcher.addCallback(this) {

            if (webViewVariable.canGoBack()) {
                webViewVariable.goBack()
            } else {
                finish()
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(a: WebView) {

        a.webViewClient = WebViewClient()

        a.settings.javaScriptEnabled = true
        a.settings.domStorageEnabled = true
        a.settings.loadsImagesAutomatically = true
        a.settings.useWideViewPort = true
        a.settings.loadWithOverviewMode = true
        a.settings.safeBrowsingEnabled = true

        a.loadUrl("https://mohitkumarshaw.netlify.app")
    }
}