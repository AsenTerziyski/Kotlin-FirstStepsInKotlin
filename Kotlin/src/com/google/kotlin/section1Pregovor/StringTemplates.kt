package com.google.kotlin.section1Pregovor

fun main() {
/*
Like in Java, Strings in Kotlin are immutable. That means that we have no means to alter a String once it’s created.
However, we may derive another String from a given one.
Kotlin has enriched the Java String class with additional functionality.

For example, the method padEnd() allows us to format a String, so that the expression:
 */
    println("Hello".padEnd(20, '!'))
    println("Yes".padStart(5, '*'))


    var n = 10
    println("Number is $n")
    val m = 100
    println("m is %d and n is %d".format(m, n))
    var message = "n+1 = ${n + 1}"
    println(message)

    n = -10
    message = "$n is ${
    when {
        n > 0 -> "positive"
        n < 0 -> "negative and ${if (n % 2 == 0) "even" else "odd"}"
        else -> "zero"
    }}"
    println(message)
//    https://www.baeldung.com/kotlin/string-templates

}