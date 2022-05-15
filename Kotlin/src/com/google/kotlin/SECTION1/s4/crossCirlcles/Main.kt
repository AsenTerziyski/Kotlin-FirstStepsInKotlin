package com.google.kotlin.SECTION1.s4.crossCirlcles

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