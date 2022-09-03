package com.fenil.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class myAdapter(song1:List<songs>):RecyclerView.Adapter<myViewHolder>(){
      val songparam=song1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
       val inflater:LayoutInflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.view,parent,false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songparam.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
      holder.title.text= songparam[position].songname
       holder.description1.text=songparam[position].description
    }

}


class myViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
    val title=itemview.findViewById<TextView>(R.id.textView5)
    val description1=itemview.findViewById<TextView>(R.id.textView6)

}
