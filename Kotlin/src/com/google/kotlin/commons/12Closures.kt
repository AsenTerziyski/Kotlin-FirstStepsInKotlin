package com.google.kotlin.commons

import kotlin.math.pow
//Closures are functions that
//can access and modify properties defined
//outside the scope of the function.
//The following closure function is a high order function that
//calculates the sum of all elements of the list and updates a property defined outside the closure.
fun main() {

    // result Area is defined outside cLambda and rectLambda:
    var resultArea = -1.00
    val cLambda:(Double) -> Unit = {rad -> resultArea = Math.PI * rad.pow(2)}
    findCArea(1.0, cLambda)
    println(resultArea.format(2))

    val rectLambda:(Double, Double) -> Unit = {a,b -> resultArea = a*b}
    findRArea(10.0,10.0,rectLambda)
    println(resultArea.format(3))

}

fun findRArea(a: Double, b: Double, rectLambda: (Double, Double) -> Unit) {
    return rectLambda(a,b)
}

fun findCArea(rad:Double, cLambda:(Double) -> Unit) {
    return cLambda(rad)
}