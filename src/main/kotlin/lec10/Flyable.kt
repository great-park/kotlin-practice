package lec10

interface Flyable {
    fun act() { // default method, 키워드 없이 구현 가능
        println("날아갑니다.")
    }
}