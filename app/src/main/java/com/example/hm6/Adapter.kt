package com.example.hm6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hm6.databinding.ItemCarBinding

class Adapter(private var carList:ArrayList<String>):RecyclerView.Adapter<Adapter.CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(carList[position])
    }

    inner class CarViewHolder(private var binding: ItemCarBinding):ViewHolder(binding.root){
        fun bind(item:String){
            binding.tvCar.text = item
        }
    }
}