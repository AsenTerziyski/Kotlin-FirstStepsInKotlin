package com.google.kotlin.section1.s4.crossCirlcles

fun main() {
    println("Start program.................")
    val mainTester = MainTester()

    try {
        mainTester.testIfTwoCirclesAreCrossing()
    } catch (e:Exception) {
        println(e.message)
    }

    println("..................end program!")
}