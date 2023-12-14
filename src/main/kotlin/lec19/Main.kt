package lec19

import lec18.Fruit as F // as import

typealias FruitFilter = (F) -> Boolean // 타입 별칭
fun filterFruits(fruits: List<F>, filter: FruitFilter) {
}