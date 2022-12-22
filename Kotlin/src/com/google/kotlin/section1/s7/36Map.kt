package com.google.kotlin.section1.s7

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val numbers = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7)

    val mapped = numbers.map { number -> number * number }
    println(mapped.joinToString(", "))

    val mapped2 = mapped.map { it * it }
    println(mapped2.joinToString("-"))

    println(numbers.filter { it <= 3 }.map { it * it }.joinToString("  "))

    val numbersAsString = numbers.reversed().map { "$it!" }
    numbersAsString.forEach { _ ->
        println(numbersAsString)
    }

    val test = numbers.map { n -> sqrt(n * 1.0) * (n * 1.0).pow(2.0) }
    test.forEach { println(String.format("%.1f", it)) }

}