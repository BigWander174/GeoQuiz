package com.example.sibsaugeoquiz.viewModels

import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val cheats: Int = 3;
    val cheatsCount = ObservableInt(cheats)
}