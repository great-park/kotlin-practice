package lec12

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("움직입니다.")
        }

        override fun fly() {
            println("날아갑니다.")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

class Person private constructor(
    var name: String,
    var age: Int
) {
        companion object Factory : Log { // 클래스와 동행하는 오브젝트, 하나의 객체로 취급: 이름도 붙일 수 있고 인터페이스 구현도 가능..
            private const val MIN_AGE: Int = 1 // const: 컴파일 시점에 결정되는 상수

            @JvmStatic //
            fun newBaby(name: String, age: Int): Person {
                return Person(name, MIN_AGE)
            }

            override fun log() {
                println("Person Factory")
            }
        }
}

object Singleton {
    var a: Int = 0
}