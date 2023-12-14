package lec20

import lec09.Person

fun main(){}

// scope function : 람다를 사용해 일시적인 영역을 만들고, 코드를 간결하게 만들거나 method chaining을 할 수 있게 해준다.
// apply, run, with, also, let
// let : 수신 객체를 람다의 인자로 전달하고 람다의 본문을 실행한 결과를 반환
fun printPerson(person: Person?) {
    person?.let { // Safe Call: person이 null이 아닐 때만 let 호출
        println(it.name)
        println(it.age)
    }
}