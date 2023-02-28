package com.example.nursing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.nursing.databinding.ActivityServiceDetailsBinding
import com.example.nursing.databinding.ActivityServicesBinding

class service_details : AppCompatActivity() {

    lateinit var binding: ActivityServiceDetailsBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServiceDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBooked.setOnClickListener {
            Toast.makeText(this,"انتظر!!",Toast.LENGTH_SHORT).show()
            handler=Handler(Looper.getMainLooper())
            handler.postDelayed({
                Toast.makeText(this,"تم الحجز",Toast.LENGTH_SHORT).show()
            },3000)
        }
    }
}