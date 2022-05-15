package com.google.kotlin.SECTION1.s2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var x = scanner.nextLine().toInt()

//    when (x) {
//        1 -> println(x)
//        2 -> println(x + 1)
//        3 -> println(x + 1)
////        ranges in Kotlin
//        in 4..9 -> println("$x is in 4 and 9")
//
//        else -> {
//            println("Invalid input: $x!")
//            println("Please try again - options: [1, 2, 3, [4...9]]!")
//        }
//    }

    var str:String = when (x) {
        1 -> "is 1"
        2 -> "is 2"
        // ranges in Kotlin
        in 3..9 -> "in 3 - 9"
        else -> "Invalid"
    }

    println(str)
//    while (x.toLowerCase() != "end") {
//        // when expression in Kotlin is like switch in Java:
//        when (x) {
//            "1" -> println(x.toInt())
//            "2" -> println(x.toInt() + 1)
//            "3" -> println(x.toInt() + 1)
//            else -> {
//                println("Invalid input: $x!")
//                println("Please try again - options: [1, 2, 3]!")
//            }
//        }
//        x = scanner.nextLine()
//    }

}