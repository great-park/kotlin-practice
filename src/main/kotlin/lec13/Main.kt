package lec13
fun main() {

}

class House(
    val address: String,
    val livingRoom: LivingRoom = LivingRoom(10.0)
) {
    class LivingRoom(
        private var area: Double
    )
}