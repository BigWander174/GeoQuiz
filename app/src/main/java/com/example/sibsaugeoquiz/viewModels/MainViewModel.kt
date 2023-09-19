package com.example.sibsaugeoquiz.viewModels

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import com.example.sibsaugeoquiz.model.Quiz

class MainViewModel : ViewModel() {
    private var currentQuestionIndex = 0
    public val quiz: Quiz = Quiz()
    public var rightAnswersCount = ObservableInt(0);

    public val isQuestionAnswered = ObservableBoolean(false)
    public val isNewQuestionAvailable = ObservableBoolean(true)
    public val currentQuestionText = ObservableField(quiz.questions[0].text)

    public fun setAnswer(answer : Boolean)
    {
        if (answer == quiz.questions[currentQuestionIndex].answer)
        {
            rightAnswersCount.set(rightAnswersCount.get() + 1)
        }
        isQuestionAnswered.set(true)
    }

    public fun getNextQuestion()
    {
        currentQuestionIndex = currentQuestionIndex.inc()
        isNewQuestionAvailable.set(currentQuestionIndex < quiz.questions.size)
        isQuestionAnswered.set(!isNewQuestionAvailable.get())
        if (currentQuestionIndex == quiz.questions.size)
            return
        currentQuestionText.set(quiz.questions[currentQuestionIndex].text)
    }
}