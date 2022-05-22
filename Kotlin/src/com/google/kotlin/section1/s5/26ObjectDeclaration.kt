package com.google.kotlin.section1.s5

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow

fun main() {
    println(Maths.findRectangleArea(10, 10))
    println(Maths.findCircleArea(10.0))
    println(Maths.findCirclePerimeter(10.0))

    println("Formatting:")
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.UP
    var output = ""
    output = df.format(Maths.piNumber)
    println(output)


    println("Formatting:")
    val testNumber1 = 1.23568955
    val testNumber2 = 10.23568955
    println("%.3f".format(testNumber1))

    println("firstNumber: ${testNumber1.format(2)} and secondNumber: ${testNumber2.format(3)}")

}

fun Double.format(digits: Int) = "%.${digits}f".format(this)

open class Circle {
    fun findCirclePerimeter(r: Double): Double {
        return 2 * Maths.piNumber
    }

    open fun findCircleArea(r: Double): Double {
        return Maths.piNumber * r.pow(2)
    }
}

object Maths : Circle() {
    const val piNumber = 3.14

    fun findRectangleArea(l: Int, b: Int): Int {
        return l * b
    }

    override fun findCircleArea(r: Double): Double {
        println("Just Override:")
        return super.findCircleArea(r)
    }
}