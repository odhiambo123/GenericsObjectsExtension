package com.davidodhiambo.genericsobjectsextension

class Question<T>(val question: String, val answer: T, val difficulty: String) {
    override fun toString(): String {
        return "Question(question='$question', answer=$answer, difficulty='$difficulty')"
    }
}
