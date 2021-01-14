package com.example.catatan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catatan.Date
import kotlinx.android.synthetic.main.date_item.view.*

class DateAdapter (val itemTips: List<Date>, val clickListener: (Date) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.date_item, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemTips[position], clickListener)
    }
    override fun getItemCount() = itemTips.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data : Date, clickListener: (Date) -> Unit){
            itemView.text_nama.text = data.namad
            itemView.text_tanggal.text = data.tanggald
        }
    }
}