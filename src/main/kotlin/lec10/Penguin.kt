package lec10

class Penguin(
    species: String
) : Animal(species, 2), Flyable, Swimmable{

    private val wingCount : Int = 2

    override fun move() {
        println("날지 못합니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act() // super<인터페이스 이름>.메소드 이름
    }
}