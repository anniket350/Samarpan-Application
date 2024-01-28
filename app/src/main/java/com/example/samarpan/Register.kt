package com.example.samarpan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class Register: AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.googleform)

        val webView = findViewById<WebView>(R.id.form)

        webView.loadUrl("https://google.com/")


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setVerticalScrollBarEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setHorizontalScrollBarEnabled(true);

        webView.webViewClient = WebViewClient()
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        finish()
        exitProcess(0)
    }
}