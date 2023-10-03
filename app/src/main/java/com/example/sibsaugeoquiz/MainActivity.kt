package com.example.sibsaugeoquiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sibsaugeoquiz.databinding.MainActivityBinding
import com.example.sibsaugeoquiz.viewModels.MainViewModel
import com.example.sibsaugeoquiz.viewModels.sharedViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val binding: MainActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.viewModel = viewModel
        viewModel.cheatsCount = sharedViewModel.cheatsCount
        binding.restartButton.setOnClickListener() {
            finish()
            startActivity(intent)
        }
        binding.cheatButton.setOnClickListener()
        {
            val intent = Intent(this, CheatActivity::class.java)
            intent.putExtra("rightAnswer", viewModel.currentQuestionAnswer.toString())
            startActivity(intent)
        }
    }
}