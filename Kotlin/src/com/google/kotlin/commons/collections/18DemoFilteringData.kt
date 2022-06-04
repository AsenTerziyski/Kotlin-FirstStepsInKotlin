package com.google.kotlin.commons.collections

fun main(args: Array<String>) {
    val numbers = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    val filtered = numbers.filter { a -> a >= 4 }
    println(filtered.joinToString(", "))

    println(numbers.filter { it in 4..8 })

    val names = listOf<String>("Ivan", "Tom", "Teddy", "Axl", "Tot", "Daddy")
    println(names.filter { it.contains('d') }.joinToString(", "))
    println(names.filter { it.contains("dd") })
    println(names.filter { it.startsWith("Te") })
    println(names.filter { it.matches("Axl".toRegex()) })
    println(names.filter { it.length>=4 })


}

