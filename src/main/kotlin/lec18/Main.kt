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

    filterFruits(fruits, isApple).forEach { println(it) } // 람다를 파라미터로!

    // 코틀린에서는 함수가 1급 시민이다. 자바에서는 2급 시민임

    // 클로저
    // 코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
    // 이렇게 해야만, 람다를 진정한 일급 시민으로 간주할 수 있다. 이러한 데이터 구조를 클로저라고 부른다.
    var targetFruitName = "바나나"
    targetFruitName = "오렌지"
    filterFruits(fruits) { it.name == targetFruitName }
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