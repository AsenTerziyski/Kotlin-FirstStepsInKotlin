package com.google.kotlin.section1.s7

fun main(args: Array<String>) {
    val mySet = setOf<Int>(0, 1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 6, 7)
    println(mySet.joinToString(", "))


    var myMutableSet = mutableSetOf<Int>(0, 1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 6, 7)
    myMutableSet.add(100)
    myMutableSet.remove(9)
    myMutableSet.removeIf { n -> n < 4 }
    myMutableSet.removeIf { it == 100 }
    myMutableSet.removeIf { n -> n % 2 == 0 }
    println(myMutableSet.joinToString(", "))
}