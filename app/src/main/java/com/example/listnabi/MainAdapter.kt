package com.example.listnabi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listnabi.databinding.ListNameBinding

class MainAdapter(private val listnameNab: ArrayList<NabiList>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {


    inner class MyViewHolder(val binding: ListNameBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder (
        ListNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tvName.text = listnameNab[position].nameEx
    }

    override fun getItemCount(): Int = listnameNab.size
}