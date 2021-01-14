package com.example.catatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_date.*

class DateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)
        val data = createDate()
        recycler_date.layoutManager = LinearLayoutManager(this)
        recycler_date.setHasFixedSize(true)
        recycler_date.adapter= DateAdapter (data,{ onItem: Date -> onItemClicked() })
    }

    private fun onItemClicked() {
        Toast.makeText(this,"Ayo Rayakan", Toast.LENGTH_SHORT).show()
    }

    private fun createDate(): List<Date> {
        val rList = ArrayList<Date>()
        rList.add(
            Date(
                "Hari Perencanaan Gerakan 1 Juta Pohon",
                "10 JANUARI"
            )
        )
        rList.add(
            Date(
                "Hari lahan basah Se Dunia",
                "2 FEBRUARI"
            )
        )
        rList.add(
            Date(
                "Hari Peduli Sampah nasional",
                "21 FEBRUARI"
            )
        )
        rList.add(
            Date(
                "Hari Strategi konservasi Se Dunia",
                "6 MARET"
            )
        )
        rList.add(
            Date(
                "Hari Bhakti Rimbawan",
                "16 MARET"
            )
        )
        rList.add(
            Date(
                "Hari Kehutanan Sedunia",
                "20 MARET"
            )
        )
        rList.add(
            Date(
                "Hari Hutan Internasional",
                "21 MARET"
            )
        )
        rList.add(
            Date(
                "Hari Air Se Dunia",
                "22 MARET"
            )
        )
        rList.add(
            Date(
                "Hari Meteorolgi",
                "23 MARET"
            )
        )
        rList.add(
            Date(
                "Hari Bumi",
                "22 APRIL"
            )
        )
        rList.add(
            Date(
                "Hari Keanekaragaman Hayati",
                "21 MEI"
            )
        )
        rList.add(
            Date(
                "Hari Lingkungan Hidup Sedunia",
                "5 JUNI"
            )
        )
        rList.add(
            Date(
                "Hari Penanggulangan Degradasi Lahan dan Kekeringan Se Dunia",
                "17 JUNI"
            )
        )
        rList.add(
            Date(
                "Hari Konservasi Alam Nasional",
                "10 AGUSTUS"
            )
        )
        rList.add(
            Date(
                "Hari Ozon Internasional",
                "16 SEPTEMBER"
            )
        )
        rList.add(
            Date(
                "Hari Habitat Se Dunia",
                "6 OKTOBER"
            )
        )
        rList.add(
            Date(
                "Hari Pangan Se Dunia",
                "16 OKTOBER"
            )
        )
        rList.add(
            Date(
                "Hari Cinta Puspa dan Satwa Nasional",
                "5 NOVEMBER"
            )
        )
        rList.add(
            Date(
                "HMPI dan BMN",
                "28 NOVEMBER"
            )
        )
        rList.add(
            Date(
                "Hari Konservasi Ken Liar Se Dunia",
                "4 DESEMBER"
            )
        )
        return rList
    }
}