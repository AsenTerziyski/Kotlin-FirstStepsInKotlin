package com.google.kotlin.section1.s2

import java.util.*

fun main() {
//    testWhen(1)
//    testWhen(3)
//    testWhen(30)
//    testWhen(true)
//    testWhen("Hello, Kotlin!")
//    testWhen(1.00)

    val scanner = Scanner(System.`in`)
    var input = scanner.nextLine()
    while (!input.equals("END", ignoreCase = true)) {
        try {
            testWhen(input.toInt())
        } catch (e: Exception) {
            println("else -->>> $input!")
        } finally {
            input = scanner.nextLine()
        }
    }

}

fun testWhen(condition: Any) {

    if (condition is Int) {
        when (condition) {
            1 -> println("condition $condition")
            2 -> println("condition $condition")
            3 -> println("condition $condition")
            4 -> println("condition $condition")
            else -> println("else -->>> $condition!")
        }
        return
    }


}


