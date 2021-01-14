package com.example.catatan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.catatan.R

class TipsWeb : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.web)
        val webView = findViewById<WebView>(R.id.webView)
        var intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.ACTION_VIEW)) {
            var web = intentThatStartedThisActivity.getStringExtra((Intent.ACTION_VIEW))
            webView.settings.javaScriptEnabled = true

            webView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(
                    view: WebView, url: String,
                    message: String,
                    result: JsResult
                ): Boolean {
                    Toast.makeText(this@TipsWeb, message, Toast.LENGTH_LONG).show()
                    result.confirm()
                    return true
                }
            }
            if (web != null) {
                webView.loadUrl(web)
            }
        }
    }
}