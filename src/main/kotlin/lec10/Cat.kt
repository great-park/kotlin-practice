package lec10

class Cat(
    species: String
) : Animal(species, 4){ // 상속은 한 칸 띄우고 쓰는 것이 관례
        override fun move() {
            println("네 발로 걷습니다.")
        }
}