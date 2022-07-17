# GenericsObjectsExtension
Best Practices

When you want a property to have differing data types, subclassing is not the answer. 
Instead, Kotlin provides something called `generic types` that allow you to have a single property that can have differing `data types`, depending on the specific use case.
![image](https://user-images.githubusercontent.com/8829018/179422933-d8e1aba6-ea0a-4e8f-8f62-f67f59043b9f.png)

Change Repetiton:
```
class fillInBlanckQuestion{class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)
class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)
```
To Generic: 

```
class Question<T>(val question: String, val answer: T, val difficulty: String) {
}
```
Now we can have:

```
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
```
