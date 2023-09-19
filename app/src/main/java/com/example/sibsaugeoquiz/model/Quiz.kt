package com.example.sibsaugeoquiz.model

class Quiz() {
    public val questions: List<Question> = listOf(
        Question("test 1", false),
        Question("test 2", true),
        Question("test 3", true),
        Question("test 4", false),
    )
}