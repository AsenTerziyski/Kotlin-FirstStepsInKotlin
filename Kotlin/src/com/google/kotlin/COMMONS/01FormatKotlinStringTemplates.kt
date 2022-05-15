package com.google.kotlin.COMMONS

import com.google.kotlin.SECTION1.s5.format

fun main() {
    val testNumber1 = 1.23568955
    val testNumber2 = 10.23568955
    println("%.3f".format(testNumber1))
    println("First Number: ${testNumber1.format(2)} and Second Number: ${testNumber2.format(3)}")

}

fun Double.format(digits: Int) = "%.${digits}f".format(this)