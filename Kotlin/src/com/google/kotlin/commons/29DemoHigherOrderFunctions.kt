package com.google.kotlin.commons

import com.google.kotlin.section1.s6.format
import kotlin.math.pow

fun main(args: Array<String>) {

    println(b())
    println(b()("Hello"))
    println(b().invoke("Hello"))

    val c = { s: String, s1: String -> s.length + s1.length }
    println(c.invoke("A", "B"))
    val invoke = c.invoke("Test1", "Test2")
    println(invoke)

    val lambda = { println("GeeksforGeeks: A Computer Science portal for Geeks") }
    higherOrderFunc1(lambda)

    val lambda2 = { s: String -> 2 * s.length }
    val result2 = higherOrderFunc2("Test1", lambda2)
    println(result2)

    val areaLambda = { a: Int, b: Int -> a * b }
    println(higherOrderFunc3(10, 10, areaLambda))

    val fullNameLambda = { s1: String, s2: String -> "Person`s full name is $s1 $s2." }
    higherOrderFuncFullName("John", "Smith", fullNameLambda)

    val fullNameLambda2 = { s1: String, s2: String -> "X |Person| |$s1| |$s2| X" }
    higherOrderFuncFullName("John", "Smith", fullNameLambda2)

    val circleAreaFunc = { rad: Double -> rad.pow(2) * Math.PI }
    println("The area is: ${getCircleArea(1.0, circleAreaFunc).format(2)}m2!")

    val test = {s:String, c:String -> s.length+c.length}
    val a = a("Peter", "Smith", test)
    println(a)

}

fun getCircleArea(rad: Double, areaFunc: (rad: Double) -> Double): Double {
    return areaFunc(rad)
}

fun higherOrderFuncFullName(firstName: String, lastName: String, fullNameFunc: (a: String, b: String) -> String): Unit {
    println(fullNameFunc(firstName, lastName))
}

fun higherOrderFunc3(a: Int, b: Int, areaFunc: (a: Int, b: Int) -> Int): Int {
    return areaFunc(a, b)
}

fun higherOrderFunc2(input: String, lmbd2: (s: String) -> Int): Int {
    return lmbd2(input)
}

fun higherOrderFunc1(lmbd: () -> Unit) {
    lmbd()
}

fun a(s1:String, s2:String, b: (String, String) -> Int): Int {
    return b(s1, s2)
}

fun b(): (String) -> Int {
    return { s -> s.length }
}

