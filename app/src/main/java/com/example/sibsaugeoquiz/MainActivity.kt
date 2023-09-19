package com.example.sibsaugeoquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sibsaugeoquiz.databinding.MainActivityBinding
import com.example.sibsaugeoquiz.viewModels.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val binding: MainActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.viewModel = viewModel
        binding.restartButton.setOnClickListener() {
            finish()
            startActivity(intent)
        }
    }
}