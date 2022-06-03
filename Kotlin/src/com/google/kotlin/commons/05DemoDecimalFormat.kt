package com.google.kotlin.commons

import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    //https://www.techiedelight.com/round-up-a-float-or-a-double-with-2-decimal-places-in-kotlin/
    val testValue = 1.2549558
    val decimalFormat = DecimalFormat("#.#")
    decimalFormat.roundingMode = RoundingMode.UP
    println(decimalFormat.format(testValue))
    println(testValue.format(2))

}