package com.google.kotlin.commons

fun main() {
    val test1 = ::doubleSum.testCurried()
    println(test1)
    println(test1(1.0))
    println(test1(1.0)(2.0))

    println(test1.invoke(10.0).invoke(1.0))
    val test2 = ::resultToString.testCurried()
    println(test2(1.0))
    println(test2(1.0).invoke(2.0))
    println(test2.invoke(5.0).invoke(5.0))


}

fun <A, B, R> ((A, B) -> R).testCurried(): (A) -> (B) -> (R) =
    { a: A -> { b: B -> this(a, b) } }

fun doubleSum(firstNumber: Double, secondNumber: Double): Double =
    2 * (firstNumber + secondNumber)

fun resultToString(firstNumber: Double, secondNumber: Double):String {
    val sum = firstNumber + secondNumber
    return "SUM = %.5f".format(sum)
}