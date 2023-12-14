package lec17

fun main() {
    val str = "Hello"
    println(str.lastChar()) // 마치 원래 String에 있는 멤버 함수처럼 사용할 수 있다.

    println(1 add2 2) // 중위 함수
}

// 확장 함수: 코드는 클래스 밖에서 작성하고, 마치 내부 함수인 것처럼 사용할 수 있음
// 캡슐화를 지키기 위해 확장 함수는 클래스에 있는 private, protected 멤버에 접근할 수 없음
// 시그니처가 같으면 멤버 함수가 우선적으로 호출된다.
// 오버라이드될 경우, 해당 변수의 현재 타입 즉, 정적인 타입에 의해 어떤 확장 함수가 호출될지 결정된다.
fun String.lastChar(): Char { // 수신객체
    return this[this.length - 1]
}


// 중위 함수
// "변수" "함수" "argument" 순서로 호출할 수 있는 함수
infix fun Int.add2(other: Int): Int {
    return this + other
}

// inline 함수
// 함수를 호출하는 곳에 함수 본문을 그대로 복붙해준다.
// 즉 함수를 호출하는 것이 아니라 로직 자체가 그대로 옮겨진다. => 함수를 파라미터로 전달할 때 오버헤드를 줄일 수 있다.
inline fun Int.add3(b: Int): Int {
    return this + b
}

// 지역 함수
// 함수 안에 함수를 정의할 수 있다.
// 함수로 추출하면 좋을 것 같은데, 이 함수를 다른 곳에서 사용할 일이 없을 때 사용한다.
