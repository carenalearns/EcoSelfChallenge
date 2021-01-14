package com.example.catatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tips.*

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)
        val data = createTips()
        recycler_tips.layoutManager = LinearLayoutManager(this)
        recycler_tips.setHasFixedSize(true)
        recycler_tips.adapter = TipsAdapter (data,{ onItem: Tips -> onItemClicked(onItem)})
    }

    private fun onItemClicked(onItem: Tips) {
        val showDetailActivityIntent = Intent(this, TipsIntent::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.img_tips)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.des)
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, onItem.web)
        startActivity(showDetailActivityIntent)
    }

    private fun createTips(): List<Tips> {
        val rvList = ArrayList<Tips>()
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        rvList.add(
            Tips(
                R.drawable.ic_baseline_menu_book_24,
                "",
                "",
                ""
            )
        )
        return rvList
    }
}