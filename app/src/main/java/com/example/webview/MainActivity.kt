package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var webView = findViewById<WebView>(R.id.webView)

        webView.webViewClient = WebViewClient()

        webView.apply {
            loadUrl("https://m.khanteum.com")
            settings.javaScriptEnabled = true
            settings.allowFileAccess = true
            settings.loadWithOverviewMode = true
            settings.databaseEnabled = true
            settings.domStorageEnabled = true
            settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
            settings.mediaPlaybackRequiresUserGesture = false
            settings.textZoom = 100
            settings.cacheMode = WebSettings.LOAD_NO_CACHE
        }
    }
}