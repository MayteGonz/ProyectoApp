package com.mayte.proyecto_app.Second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mayte.proyecto_app.R
import com.mayte.proyecto_app.databinding.ActivityMainBinding
import com.mayte.proyecto_app.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}