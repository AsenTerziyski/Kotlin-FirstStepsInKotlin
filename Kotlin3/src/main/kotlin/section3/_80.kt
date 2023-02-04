package section3

fun main() {
    val phoneNumber = "+359899040509"
    with(phoneNumber) {
        println(getShortPhoneNumber())
        println(getCountryCode())
    }

    phoneNumber.apply {
        val test = getShortPhoneNumber() + "!"
        println(test)
    }
}