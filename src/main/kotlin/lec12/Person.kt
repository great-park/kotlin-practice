package lec12

class Person private constructor(
    var name: String,
    var age: Int
) {
        companion object {
            private val MIN_AGE: Int = 1
            fun newBaby(name: String, age: Int): Person {
                return Person(name, MIN_AGE)
            }
        }
}