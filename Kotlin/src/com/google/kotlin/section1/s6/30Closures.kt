package com.google.kotlin.section1.s6

fun main() {
    var result = 0
    println(result)
    val lambda: (Int, Int) -> Unit = { a, b -> result = a + b }
    sumTwoInts(1, 2, lambda)
    println(result)
}

fun sumTwoInts(a: Int, b: Int, myFunction: (Int, Int) -> Unit) {
    return myFunction(a, b)
}
