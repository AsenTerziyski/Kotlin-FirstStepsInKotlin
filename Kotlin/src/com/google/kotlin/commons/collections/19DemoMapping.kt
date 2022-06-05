package com.google.kotlin.commons.collections

import com.google.kotlin.section1.s6.format
import kotlin.math.pow

fun main(args: Array<String>) {
    val names = listOf<String>("Ivan", "Teo")
    val mapped = names.map { "Name: $it" }
    println(mapped.joinToString(", "))

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6)
    println(numbers.filter { it <= 3 }.map { it * 2 }.joinToString(", "))

    val doubles = mutableListOf<Double>(1.0, 2.0, 3.0)
    println(doubles.map { it.pow(2) }.joinToString(", "))

    val mapFirst = numbers.map { it * 1.0 }
    val mapSecond = mapFirst.map { it.format(5) }
    mapSecond.forEach{ println(it)}

    println(numbers.joinToString("-x-x-x-") { ((it * 1.0).pow(2.0)).format(3) })
}