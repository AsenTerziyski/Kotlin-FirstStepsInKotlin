package com.google.kotlin.commons

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt


/*
I think they can explain it better than I can
but I will try. In conventional programming when you loop through a collection you might do:
for (element in collection) { println(element) }
When using Kotlin functional features you can do something like:
collection.map { println(it) }

Which is equivalent to the code above

One other helpful convention is that if
a function literal has only one parameter,
its declaration may be omitted (along with the ->), and its name will be it:
 */
fun main(args: Array<String>) {

    println(strLength("TEST") { it.length })
    println(getAbsValueOfNumber(-111) { abs(it) })
    println(getAbsValueOfNumber(111) { abs(it) })

    println(getSqrtOfNumber(4.0) { sqrt(it) }.format(2))

    try {
        println(getSqrtOfNumber(Math.PI.pow(2)) { sqrt(it) }.format(7))
    } catch (e: Exception) {
        println(e.message)
    }

    println(findCircleArea(1.0) { Math.PI * it.pow(2) }.format(2))

    val listOf = listOf<Int>(1, 2, 3, 7, 0, 100, 25, 3, 7, 5, 4, 3, 2, 1)
    listOf
        .filter { it >= 4 }
        .sortedDescending()
        .map { "*$it*" }
        .forEach { print("$it ")}

}


fun strLength(input: String, myTestFunction: (String) -> Int): Int {
    return myTestFunction(input)
}

fun getAbsValueOfNumber(numb: Int, myAbsFunction: (Int) -> Int): Int {
    return myAbsFunction(numb)
}

fun getSqrtOfNumber(numb: Double, mySqrtFunction: (Double) -> Double): Double {
    if (numb < 0) {
        throw Exception("Number [$numb] should be positive or zero!")
    }
    return mySqrtFunction(numb)
}

fun findCircleArea(rad: Double, myCircleAreaFun: (Double) -> Double): Double {
    if (rad <= 0) {
        throw Exception("Radius [$rad] should be positive!")
    }
    return myCircleAreaFun(rad)
}
