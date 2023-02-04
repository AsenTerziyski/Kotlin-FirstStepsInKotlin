package section3

import java.lang.IllegalArgumentException
import java.lang.StringBuilder
import java.text.DateFormat
import java.util.*

fun main() {

    val date = Date()
    println("Today is ${date.getShortDate()}")
    val testInt = 7
    println(testInt.convertToDouble())
//    val testInt2 = 5
//    val testInt3 = 4
//    println(testInt2.isChetno())
//    println(testInt3.isChetno())
    val list = listOf<Int>(1, 2, 3, 4, 5, 6)
    list.map { l -> l.isEvenNumber() }.forEach { println(it) }
    println("+359892062899".getShortPhoneNumber())
    println("+359892062899".getCountryCode())
    println("+359892062899".isBGPhoneNumber())
    println("+449892062899".isBGPhoneNumber())

    println(7.isEvenNumber())
    println(8.isEvenNumber())

    var test100 = StringBuilder("+359892062899")
    test100.countryCode = "+XXX"
    println(test100.countryCode)

}

private fun Date.getShortDate() = DateFormat.getDateInstance().format(this)

private fun Int.convertToDouble() = this * 1.0

private fun Int.isEvenNumber() = when {
    this % 2 == 0 -> "$this is even"
    this % 2 != 0 -> "$this is not even"
    else -> throw IllegalArgumentException("Enter valid argument!")
}

fun String.getShortPhoneNumber() = "0" + this.substring(4)
fun String.getCountryCode() = this.subSequence(0, 4)
fun String.isBGPhoneNumber() = when {
    this.subSequence(0, 4) == "+359" -> "Bulgaria"
    else -> "Any country"
}

var StringBuilder.countryCode: String
    get() = this.substring(0, 4)
    set(value) {
        this.replace(0, 4, value)
    }



