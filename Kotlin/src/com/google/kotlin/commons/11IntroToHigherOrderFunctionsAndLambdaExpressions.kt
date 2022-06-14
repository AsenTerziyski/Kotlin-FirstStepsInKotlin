package com.google.kotlin.commons

import com.google.kotlin.section1.s5.format
import kotlin.math.pow

//In Kotlin, a function which can accept a function as parameter or can return a function
// is called Higher-Order function.
// Instead of Integer, String or Array as a parameter to function,
// we will pass anonymous function or lambdas.
fun main() {
    val myLambdaFunction: (Int, Int) -> Int = { x, y -> x + y }
    println(myLambdaFunction(3, 4))
    println(addTwoNumbers(5, 6, myLambdaFunction))

    val myLambdaFunctionSecond: (Double, Double) -> Double = { a, b -> a * b }
    println(myLambdaFunctionSecond(10.0, 5.0))

    val myLambdaFunctionThird: (Double) -> Double = { rad -> Math.PI * rad.pow(2) }
    println(findCircleAreaSecond(1.0, myLambdaFunctionThird).format(2))

    val rectAreaL: (Double, Double) -> Double = { a, b -> a * b }
    println(findRectangleArea(50.0, 10.0, rectAreaL).format(2))

    val pl: (Double, Double) -> String = { base, part -> "%.2f".format(100 * part / base) + "%" }
    println(findPercentageFromBase(100.0, 7.0, pl))

    val sumLambda: (Int, Int) -> Double = { a, b -> 1.0 * (a + b) }
    println(sumTwoIntNumbers(10, 2, sumLambda))

}

fun addTwoNumbers(firstInt: Int, secondInt: Int, myLambdaFunction: (Int, Int) -> Int): Int {
    return myLambdaFunction(firstInt, secondInt)
}

fun findCircleAreaSecond(radius: Double, myLambdaFunctionThird: (Double) -> Double): Double {
    return myLambdaFunctionThird(radius);
}

fun findRectangleArea(a: Double, b: Double, rectAreaLambda: (Double, Double) -> Double): Double {
    return rectAreaLambda(a, b)
}

fun findPercentageFromBase(base: Double, part: Double, percentageLambda: (Double, Double) -> String): String {
    return percentageLambda(base, part)
}

fun sumTwoIntNumbers(a: Int, b: Int, sumL: (Int, Int) -> Double): String {
    val sum = sumL(a, b).format(2)
    return "The sum is: $sum!"
}






