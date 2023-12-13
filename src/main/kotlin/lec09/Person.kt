package lec09

fun main() {
    val person = Person("홍길동", 20)
    println(person.name)
    println(person.age)
    person.age = 30
    println(person.age)
}

class Person ( // 주 생성자에 파라미터가 없으면, 생략 가능
    val name: String = "이름 없음", // 디폴트 값
//    name: String,
    var age: Int = 1
) {

//    val name: String = name
//        get() = field.uppercase() // backing field (자기 자신을 가리킴),  만약 name으로 쓰면 무한 루프

    fun getUppercaseName(): String = this.name.uppercase()

    val upperName: String
        get() = this.name.uppercase()

    // init 블록 : 생성자가 호출될 때 실행되는 블록
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 0보다 작을 수 없습니다.")
        }
    }

    // 1. 함수로 만들기
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // 2. 프로퍼티처럼 만들기 - custom getter
    // isAdult2 라는 프로퍼티를 get 했을 때 아래 get() 로직을 실행시킴
    val isAdult2: Boolean
        get() = this.age >= 20


}