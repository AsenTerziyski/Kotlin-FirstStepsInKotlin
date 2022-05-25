package com.google.kotlin.softuni.oop.`01abstraction`.pr01

import java.util.*

fun main() {
    println("START......")
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val values = CardSuite.values()
    for (value in values) {
        println("Ordinal value: %d; Name value: %s".format(value.value, value.name))
    }
    println("........END")

}