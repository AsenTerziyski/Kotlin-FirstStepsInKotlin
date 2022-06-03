package com.google.kotlin.section1.s2

import java.util.*

fun main() {
    println("Hello :)")
    val scanner = Scanner(System.`in`)

    val firstNumber: Int
    val secondNumber: Int

    try {
        firstNumber = scanner.nextLine().toInt()
        secondNumber = scanner.nextLine().toInt()
        when {
            firstNumber < secondNumber -> printEvens(firstNumber, secondNumber)
            secondNumber < firstNumber -> printOdds(secondNumber, firstNumber)
            else -> println(firstNumber)
        }
    } catch (e: Exception) {
        println("Inputs should be ints -> \"${e.message}!\"")
    } finally {
        println("Buy! :) ")
    }

}

fun printOdds(secondNumber: Int, firstNumber: Int) {
    for (i in secondNumber..firstNumber) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}

fun printEvens(firstNumber: Int, secondNumber: Int) {
    for (i in firstNumber..secondNumber) {
        if (i % 2 == 0) println(i)
    }
}
