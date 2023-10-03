package com.example.sibsaugeoquiz.viewModels

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class CheatViewModel : ViewModel() {
    public var cheatsCount = ObservableInt(0)
    public var isHintRequested = ObservableBoolean(false)
    public var rightAnswer = ObservableField("")

    fun requestHint()
    {
        cheatsCount.set(cheatsCount.get().dec())
        isHintRequested.set(true)
    }
}