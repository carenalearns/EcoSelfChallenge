package com.example.catatan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catatan.R
import kotlinx.android.synthetic.main.detail_tips.*

class TipsIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_tips)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var img_tips = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var des = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var web = intentThatStartedThisActivity.getStringExtra((Intent.ACTION_PICK))

            image_tips.setImageResource(img_tips)
            text_title.text = nama
            text_desc.text = des
            text_web.setOnClickListener { openwebsite(web) }
        }
    }
        private fun openwebsite(url:String?) {
            val showWebActivity = Intent(this, TipsWeb::class.java)
            showWebActivity.putExtra(Intent.ACTION_VIEW, url)
            startActivity(showWebActivity)
        }
}