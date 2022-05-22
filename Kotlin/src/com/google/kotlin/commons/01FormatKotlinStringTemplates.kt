package com.google.kotlin.commons

import com.google.kotlin.section1.s5.format

fun main() {
    val testNumber1 = 1.23568955
    val testNumber2 = 10.23568955
    println("%.3f".format(testNumber1))
    println("First Number: ${testNumber1.format(2)} and Second Number: ${testNumber2.format(3)}")

    println("%.1f + %.2f + %.3f".format(1.789, 2.999, 3.2569))
    println("The volume is %.3f %c %d %b".format(2.759, 'a', 5, false))

}

fun Double.format(digits: Int) = "%.${digits}f".format(this)