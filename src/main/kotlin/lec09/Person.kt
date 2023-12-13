package lec09

fun main() {
    val person = Person("홍길동", 20)
    println(person.name)
    println(person.age)
    person.age = 30
    println(person.age)
}

class Person (
    val name: String,
    var age: Int
)