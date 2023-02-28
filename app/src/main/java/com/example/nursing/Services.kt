package com.example.nursing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nursing.databinding.ActivityMainBinding
import com.example.nursing.databinding.ActivityServiceDetailsBinding
import com.example.nursing.databinding.ActivityServicesBinding

class Services : AppCompatActivity() {

    lateinit var binding: ActivityServicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var ServicesList = ArrayList<String>()
        ServicesList.add("رعاية مسنين")
        ServicesList.add("حروق و جروح")
        ServicesList.add("رعاية ما بعد العمليات")
        ServicesList.add("تمريض مقيم")
        ServicesList.add("خدمات تمريضية سريعة")
        ServicesList.add("رعاية كورونا والحجر الصحي")
        binding.apply {
            servicesOrder.adapter=ServicesAdapter(ServicesList)

        }
      // binding.servicesOrder.setOnClickListener {
           startActivity(Intent(binding.root.context,service_details::class.java))
      // }

    }
}