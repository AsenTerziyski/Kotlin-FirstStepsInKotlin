package com.google.kotlin.commons

fun main() {
    val pair = Pair("A", 100)
    println("${pair.first} goes to ${pair.second}")

    val pairTwo = "B" to 200
    println("${pairTwo.first} goes to ${pairTwo.second}")

    val(f,s) = pair
    println(f)
    println(s)

    val(f1,s1) = pairTwo
    println(f1)
    println(s1)
}

