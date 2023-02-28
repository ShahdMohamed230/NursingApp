package com.example.nursing

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nursing.databinding.ActivityServiceDetailsBinding
import com.example.nursing.databinding.ActivityServicesBinding
import com.example.nursing.databinding.ItemListBinding
var position1:Int=-1
class ServicesAdapter (private val list1:List<String>): RecyclerView.Adapter<ServicesAdapter.ViewHolder>() {
    class ViewHolder(binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        var tvMaterial: TextView =binding.tvService

        lateinit var binding1: ActivityServicesBinding
        lateinit var binding2: ActivityServiceDetailsBinding

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvMaterial.text = list1[position]
        holder.tvMaterial.setOnClickListener {
          position1=position
        }
    }
}