package com.example.hm6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hm6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_for_fragment, CarFragment()).commit()
    }
}