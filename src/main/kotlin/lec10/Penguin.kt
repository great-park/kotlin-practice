package lec10

class Penguin(
    species: String
) : Animal(species, 2){

    private val wingCount : Int = 2

    override fun move() {
        println("날지 못합니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}