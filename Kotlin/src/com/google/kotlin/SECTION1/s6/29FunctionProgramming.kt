package com.google.kotlin.SECTION1.s6

fun main(args: Array<String>) {

    val circleArea: (Double) -> Double = { r: Double -> Math.PI * r }

    val area = findCircleArea(5, circleArea)
    println(area)

    // void function
    val result: (Int, Int) -> Unit = { a: Int, b: Int -> println(a + b) }
    functionAddAndPrint(2,5, result)
}

fun functionAddAndPrint(a: Int, b: Int, myFunction: (Int, Int) -> Unit) {
    return myFunction(a,b)
}

fun findCircleArea(radius: Int, circleArea: (Double) -> Double): Double {
    return circleArea(1.0)
}
