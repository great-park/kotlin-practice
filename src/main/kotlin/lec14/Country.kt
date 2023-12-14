package lec14

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.AMERICA -> println("미국")
    }
}

enum class Country(
    private val codee: String,
) {
    KOREA("KR"),
    AMERICA("US"),
}