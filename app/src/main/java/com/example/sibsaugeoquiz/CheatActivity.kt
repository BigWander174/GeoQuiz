package com.example.sibsaugeoquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sibsaugeoquiz.databinding.CheatActivityBinding
import com.example.sibsaugeoquiz.viewModels.CheatViewModel
import com.example.sibsaugeoquiz.viewModels.sharedViewModel

class CheatActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[CheatViewModel::class.java]
        val binding: CheatActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.cheat_activity)

        viewModel.cheatsCount = sharedViewModel.cheatsCount
        viewModel.rightAnswer.set(intent.getStringExtra("rightAnswer"))

        binding.viewModel = viewModel
    }
}