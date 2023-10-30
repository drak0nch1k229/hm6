package com.example.hm6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hm6.databinding.FragmentCarBinding


class CarFragment : Fragment() {
    private lateinit var binding: FragmentCarBinding
    private lateinit var carList:ArrayList<String>
    private lateinit var carAdapter:Adapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loaData()
        carAdapter = Adapter(carList)
        binding.rvCars.adapter = carAdapter
    }

    private fun loaData() {
        carList = ArrayList()
        carList.add("BMW")
        carList.add("Toyota")
        carList.add("Mercedes")
        carList.add("Lexus")
        carList.add("Kia")
        carList.add("Nissan")
        carList.add("Hyundai")
        carList.add("Audi")
        carList.add("Skoda")
        carList.add("Lada")
        carList.add("Land Rower")
        carList.add("Renault")
        carList.add("Volkswagen")
        carList.add("Ford")
        carList.add("Mazda")
        carList.add("Porsche")
        carList.add("Mitsubishi")
        carList.add("УАЗ")
        carList.add("Chevrolet")
        carList.add("Volvo")
    }


}