package com.hazem.taskfive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val items: ArrayList<String>): RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
  inner class ItemViewHolder(view:View):RecyclerView.ViewHolder(view){
       // var ivPhoto:ImageView
        var tvTitle: TextView? =null
       init {
           //ivPhoto.findViewById<ImageView>(R.id.iv_item)
           tvTitle=view.findViewById<TextView>(R.id.tv_message)

       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
   val inflater =LayoutInflater.from(parent.context)
    val view = inflater.inflate(R.layout.item,parent,false)
       return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.tvTitle?.text=items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}