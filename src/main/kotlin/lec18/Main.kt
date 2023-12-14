package lec18

fun main() {
    val fruits = listOf(
        Fruit("Apple", 1000),
        Fruit("Banana", 2000),
        Fruit("Orange", 3000),
        Fruit("Grape", 4000),
        Fruit("Watermelon", 5000),
    )

    // 람다를 만드는 방법 1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "Apple"
    }

    // 람다를 만드는 방법 2
    val isApple2 = { fruit: Fruit -> fruit.name == "Apple" }

}