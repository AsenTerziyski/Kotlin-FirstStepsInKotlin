package com.google.kotlin.commons

import kotlin.math.pow

fun main() {
    val result = ::stringLength.andThen1(::radiusX2)
    println(result)
    println(result("a"))
    val result2 = result.andThen1(::circleArea)
    println(result2)
    println(result2("a"))

    val result3 = ::stringLength.andThen1(::radiusX2).andThen1(::circleArea)
    println(result3)
    println(result3("a"))

    listOf<String>("a", "ab", "abc")
        .map(::stringLength)
        .map(::radiusX2)
        .map(::circleArea)
        .forEach { println("The area is: $it.") }

    val map = listOf("1", "1 2", "1 2 3")
        .map(::stringLength)
        .map(::radiusX2)
        .map(::circleArea)
        .map { "AREA IS %.2fm2".format(it) }
    println(map.joinToString(", "))
}

fun <A, B, Result> ((A) -> B).andThen1(myFunction: (B) -> Result): (A) -> Result =
    { a1 -> myFunction(this(a1)) }

//fun <T1, T2, R> ((T1) -> T2).andThen(f: (T2) -> R): (T1) -> R =
//    { t1 -> f(this(t1)) }

fun stringLength(str: String): Int {
    return str.length
}

fun radiusX2(radius: Int): Double {
    return radius * 2.0
}

fun circleArea(rad: Double): Double {
    return Math.PI * rad.pow(2)
}
