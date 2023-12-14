package lec17

fun main() {
    val str = "Hello"
    println(str.lastChar()) // 마치 원래 String에 있는 멤버 함수처럼 사용할 수 있다.
}

// 확장 함수: 코드는 클래스 밖에서 작성하고, 마치 내부 함수인 것처럼 사용할 수 있음
fun String.lastChar(): Char {
    return this[this.length - 1]
}