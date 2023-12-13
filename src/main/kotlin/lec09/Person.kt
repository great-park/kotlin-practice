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
    var age: Int = 1
) {
    // init 블록 : 생성자가 호출될 때 실행되는 블록
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 0보다 작을 수 없습니다.")
        }
    }

//    // 추가 생성자 (부 생성자) - 디폴트 파라미터 대신 사용 가능
//    constructor(name: String) : this(name, 1)
//    constructor(age: Int) : this("이름 없음", 1)
}