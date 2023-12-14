package lec15

fun main() {
    val array = arrayOf(100, 200)
    for (i in array.indices) {
        println(array[i])
    }
    array.plus(300)
    for (i in array.withIndex()) {
        println("${i.index} : ${i.value}")
    }

    // 불변
    val numbers = listOf(1, 2, 3, 4, 5)
    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((index,number) in numbers.withIndex()) {
        println("$index : $number")
    }

    val setNumber = setOf(1, 2, 3, 4, 5)

    // 가변
    val numbers2 = mutableListOf(1, 2, 3, 4, 5)
    numbers2.add(6)
    numbers2.removeAt(0)

    val setNumber2 = mutableSetOf(1, 2, 3, 4, 5)
    val map = mutableMapOf("one" to 1, "two" to 2)
    for (key in map.keys) {
        println("$key : ${map[key]}")
    }
    for ((key, value) in map.entries) {
        println("$key : $value")
    }

}