package com.google.kotlin.section1.s7

fun main(args: Array<String>) {
    val numbers = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7)
    val filteredNumbers = numbers.filter { a -> a <= 3 }

    for (number in filteredNumbers) {
        println(number)
    }

    val joinToString = filteredNumbers.joinToString(", ")
    println(joinToString)

    val secondFilteredNumbers = numbers.filter { it < 5 }
    println(secondFilteredNumbers.joinToString("-"))


    val names = listOf<String>("Ivan", "Tom", "Teddy", "Axl", "Tot")
    val filteredNames = names.filter { it.startsWith("T") }
    val joinToString1 = filteredNames.joinToString(", ")
    println(joinToString1)
    val filter = names.filter { it.length <= 3 }
    println(filter.joinToString(", "))
}