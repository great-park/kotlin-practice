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

class House2(
    var address: String
) {
    var livingRoom = this.LivingRoom(10.0)

    inner class LivingRoom(
        private var area: Double
    ) {
        val address: String
            get() = this@House2.address
    }
}