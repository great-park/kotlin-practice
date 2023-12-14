package lec11

val NUM = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat private constructor() { // 생성자에 접근 지시어를 붙이고 싶으면 constructor를 써야 됨
}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}