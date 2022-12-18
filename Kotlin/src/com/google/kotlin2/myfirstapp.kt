package com.google.kotlin2

import java.util.*

fun main(args: Array<String>) {
    println("Hello Kotlin")
    val a = 5
    val b = 7
    val greaterNumber: Int = if (a > b) a else b
    println("$greaterNumber")

    val scanner = Scanner(System.`in`)
    when(scanner.nextLine().toInt()) {
        1 -> println("One")
        2 -> println("Two")
        7-> println("Seven")
        100 -> {
            val result = 100 + 7
            println("Result is $result")
        }
        else -> println("Something other!")
    }
}