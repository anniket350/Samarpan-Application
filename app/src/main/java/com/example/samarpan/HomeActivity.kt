package com.example.samarpan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class HomeActivity : AppCompatActivity() {
    private lateinit var btnRegister: Button
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.website)

        val webView = findViewById<WebView>(R.id.web)

        webView.loadUrl("https://spiffy-bombolone-484dc2.netlify.app/")


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setVerticalScrollBarEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setHorizontalScrollBarEnabled(true);

        webView.webViewClient = WebViewClient()
        btnRegister = findViewById(R.id.button)
        btnRegister.setOnClickListener{
            val intent = Intent(this@HomeActivity, Register::class.java)
            startActivity(intent)

        }
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        finish()
        exitProcess(0)
    }

}