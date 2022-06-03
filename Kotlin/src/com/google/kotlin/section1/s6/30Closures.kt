package com.google.kotlin.section1.s6

import kotlin.math.pow

//Closures are functions that
//can access and modify properties defined
//outside the scope of the function.
//The following closure function is a high order function that
//calculates the sum of all elements of the list and updates a property defined outside the closure.
fun main() {
    var result = 0
    println(result)
    val lambda: (Int, Int) -> Unit = { a, b -> result = a + b }
    sumTwoInts(1, 2, lambda)
    println(result)

}

fun sumTwoInts(a: Int, b: Int, myFunction: (Int, Int) -> Unit) {
    return myFunction(a, b)
}




