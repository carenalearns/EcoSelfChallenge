package com.example.catatan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catatan.Tips
import kotlinx.android.synthetic.main.tips_item.view.*

class TipsAdapter (val itemFac: List<Tips>, val clickListener: (Tips) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.tips_item, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }
    override fun getItemCount() = itemFac.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data : Tips, clickListener: (Tips) -> Unit){
            itemView.image_tips.setImageResource(data.img_tips)
            itemView.text_title.text = data.nama
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}