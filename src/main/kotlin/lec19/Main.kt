package lec19

import lec18.Fruit as F // as import

typealias FruitFilter = (F) -> Boolean // 타입 별칭
fun filterFruits(fruits: List<F>, filter: FruitFilter) {
}

data class Person(
    val name: String,
    val age: Int,
)

fun main() {
    val person = Person("홍길동", 20)
    val (name, age) = person // 구조 분해 선언: componentN() 함수를 호출하여 변수에 값을 할당하는 것
    // name = person.component1()
    // age = person.component2()
}