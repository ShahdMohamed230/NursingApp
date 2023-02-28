package com.example.nursing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nursing.databinding.ActivityMainBinding
import com.example.nursing.databinding.ActivityServicesBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {

            startActivity(Intent(binding.root.context,Services ::class.java))
        }
    }
}