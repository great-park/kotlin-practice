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
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean { // 함수의 타입 나타내기
        return fruit.name == "Apple"
    }

    // 람다를 만드는 방법 2
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "Apple" }

}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}