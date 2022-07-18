package com.davidodhiambo.genericsobjectsextension

/*
* All questions have:
* 1. questionText
* 2. answer
* 3. difficultyLevel
*
* we don't want to use inheritance here because we want to use the same class for all questions
* by using generics we can create a generic class that can be used for all questions
* by using generics we have created a single class that can represent any question return type
* String, Int, Boolean, etc
*
* the generic data type is provided when the class is instantiated
*
* */
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
) {
    enum class Difficulty {
        EASY,
        MEDIUM,
        HARD
    }
}
fun main() {

    println("${Quiz.answered} of ${Quiz.total} answered.")

    println()
}