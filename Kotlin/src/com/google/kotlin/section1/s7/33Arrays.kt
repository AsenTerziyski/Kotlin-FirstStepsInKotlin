package com.google.kotlin.section1.s7

fun main() {
    var numbers = Array(5) { 0 }

    for (number in numbers) {
        println(number)
    }

    println()

    for (index in 0 until numbers.size) {
        println(numbers[index])
    }

    numbers[2] = 100
    // next will throw Exception!
//    numbers[100] = 10

    println()

    val joinToString = numbers.joinToString(", ")
    println(joinToString)

    val names = Array<String>(20) { "n/a" }
    names[7] = "Ivan"
    names[17] = "Peter"
    println(names.joinToString(", "))

    names.forEach {
        println(it)
    }

    try {
        names[22] = "??"
    } catch (e: Exception) {
        println(e.message)
    }
}