package com.example.quizella.data.questions

import com.example.quizella.domain.model.Question

data class QuestionListState(
    val list: MutableList<Question> = mutableListOf(),
    val tempPoints: Int = 0,
    val points: Int = 0
)