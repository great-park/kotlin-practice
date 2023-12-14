package lec20

import lec09.Person

fun main(){

    // let: 하나 이상의 함수를 call chain 결과로 호출할 때
    val strings = listOf("Apple", "Banana", "Orange", "Pear", "Grape", null)
    strings.map { it?.length ?: 0 }
        .filter { it > 3 }
        .let(::println)

    // let: non-null 값에 대해서만 code block을 실행시킬 때
    val length = strings?.let {
        println(it)
        it.size
    }

    // let: 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let {
            firstItem ->
            if(firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    // run: 객체 초기화와 반환 값의 계산을 동시에 해야 할 때
    val person = Person("홍길동", 20).run {
        // 바로 실시한 계산 로직 추가
        // ex) 객체를 만들어 DB에 바로 저장하고, 그 인스턴스를 활용할 때 - this 사용
        }

    // apply, also : 객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때
    fun createPerson(
        name: String,
        age: Int,
        address: String
    ): Person2 {
        return Person2(name, age).apply {
            this.address = address
        }
    }

    mutableListOf("one", "two", "three")
        .also {println("four 추가 이전 지금 값: $it")}
        .add("four")


    // with: 특정 객체를 다른 객체로 변환해야 하는데, 모듈 간의 의존성에 의해서 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때


}

data class Person2(
    var name: String,
    var age: Int,
) {
    var address: String? = null
}

// scope function : 람다를 사용해 일시적인 영역을 만들고, 코드를 간결하게 만들거나 method chaining을 할 수 있게 해준다.
// apply, run, with, also, let
// let : 수신 객체를 람다의 인자로 전달하고 람다의 본문을 실행한 결과를 반환
// run : 수신 객체를 람다의 수신 객체로 전달하고 람다의 본문을 실행한 결과를 반환
// apply : 수신 객체를 람다의 수신 객체로 전달하고 수신 객체 자체를 반환
// also : 수신 객체를 람다의 인자로 전달하고 수신 객체 자체를 반환
// with : 수신 객체를 람다의 수신 객체로 전달하고 람다의 본문을 실행한 결과를 반환
fun printPerson(person: Person?) {
    person?.let { // Safe Call: person이 null이 아닐 때만 let 호출
        println(it.name)
        println(it.age)
    }
}