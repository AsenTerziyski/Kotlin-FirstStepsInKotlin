package com.google.kotlin.SECTION1.s6

fun main() {
    val myLambdaFunction: (Int, Int) -> Int = { x, y -> x + y }
    val result = myLambdaFunction(3, 4)
    println(result)

    println(addTwoNumbers(3, 4, myLambdaFunction))
}

fun addTwoNumbers(firstInt: Int, secondInt: Int, myLambdaFunction: (Int, Int) -> Int): Int {
    return myLambdaFunction(30, 4)
}
