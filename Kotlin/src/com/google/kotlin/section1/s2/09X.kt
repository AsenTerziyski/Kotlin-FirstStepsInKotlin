package com.google.kotlin.section1.s2

import com.google.kotlin.commons.format
import com.google.kotlin.section2.doubleInt

fun main() {
    val testInt = 2
    val testInt2: Int = 5
    val testByte: Byte = 127
    println("$testInt$testInt2$testByte")
    val testString = "$testInt$testInt2$testByte"
    val toInt = testString.toInt()
    println(toInt % 10)
    println(toInt / 10)

    val testFloat: Float = 2.75F
    val testDouble = 2.5555
    println(testDouble.format(3))

    val oneMillion = 1_000_000
    println(oneMillion / 10)

    var a: Int = 1007
    val boxedA: Int = a / 10
    val boxedA2: Int = a % 10
    val anotherBoxedA: Int? = a
    println(boxedA)
    println(boxedA2)
    a %= 10
    println(a)
    a %= 2
    println(a)


    testFunction(1)
    testFunction("1")
    testFunction(1.0)

    val y = 12
    val z:String? = y as? String
    println(z)

    val aa = "T"
    if (aa is String) {
        println(aa)
    } else {
        println("aa->$aa is not string!")
    }


}

private fun testFunction(x: Any) {
    when (x) {
        is Int -> println("$x is int")
        is String -> println("$x is string")
        else -> println("$x is neither int or string")
    }
}