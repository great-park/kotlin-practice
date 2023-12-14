package lec17

fun main() {
    val str = "Hello"
    println(str.lastChar()) // 마치 원래 String에 있는 멤버 함수처럼 사용할 수 있다.
}

// 확장 함수: 코드는 클래스 밖에서 작성하고, 마치 내부 함수인 것처럼 사용할 수 있음
// 캡슐화를 지키기 위해 확장 함수는 클래스에 있는 private, protected 멤버에 접근할 수 없음
// 시그니처가 같으면 멤버 함수가 우선적으로 호출된다.
// 오버라이드될 경우, 해당 변수의 현재 타입 즉, 정적인 타입에 의해 어떤 확장 함수가 호출될지 결정된다.
fun String.lastChar(): Char { // 수신객체
    return this[this.length - 1]
}