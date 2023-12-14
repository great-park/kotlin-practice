package lec14

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.AMERICA -> println("미국")
    }
}

fun handleCar(car: Car) {
    when (car) {
        is Avante -> println("아반떼")
        is Sonata -> println("소나타")
        is Genesis -> println("제네시스")
    }
}

sealed class Car(
    val name: String,
    val price: Long,
)

class Avante: Car("아반떼", 10000000L)
class Sonata: Car("소나타", 20000000L)
class Genesis: Car("제네시스", 30000000L)

enum class Country(
    private val codee: String,
) {
    KOREA("KR"),
    AMERICA("US"),
}