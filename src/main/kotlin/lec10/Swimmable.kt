package lec10

interface Swimmable {
    val swimAbility: Int

    fun act() {
        println("수영합니다.")
    }
}