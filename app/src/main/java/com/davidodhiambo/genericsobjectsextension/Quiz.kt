package com.davidodhiambo.genericsobjectsextension

class Quiz {
    val question1 = Question<String>("What came first Chicken or Egg...", "Egg", Question.Difficulty.MEDIUM)
    val question2 =
        Question<Boolean>("Tomatoes and pumpkins are fruits true or false",true, Question.Difficulty.EASY)
    val question3 =
        Question<Int>("How many days are there between full moons?", 28, Question.Difficulty.HARD)


    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

}

