package com.example.quizella.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions_table")
 data class Question (
     val category: String,
     @PrimaryKey
     val id: String,
     val correctAnswer: String,
     val answers: List<String>,
     val tags: List<String>,
     val difficulty: String,
     val type: String,
     val question: String,
     val regions: List<String>?,
     val isNiche: Boolean
)