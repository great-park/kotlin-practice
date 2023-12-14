package lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 프로퍼티를 override 하려면 open 이어야 함
) {
    abstract fun move()
}