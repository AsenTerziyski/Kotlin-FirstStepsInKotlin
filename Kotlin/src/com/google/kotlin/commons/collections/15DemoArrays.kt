package com.google.kotlin.commons

fun main(args: Array<String>) {

    val numbers = Array(3) { 7 }
    for (number in numbers) {
        print(" $number")
    }

    for (element in numbers) {
        println(element)
    }

    val str = numbers.joinToString(" ")
    println(str)

    val names = Array<String>(20) { "N/A" }
    names[0] = "John"
    names[7] = "Ivan"
    names[names.size - 1] = "Peter"
    println(names.joinToString(", "))

    val plus = names.plus("Smith")
    println(plus.joinToString("-"))
    val copyOfRange = plus.copyOfRange(7, plus.size)
    for (s in copyOfRange) {
        println(s)
    }
}