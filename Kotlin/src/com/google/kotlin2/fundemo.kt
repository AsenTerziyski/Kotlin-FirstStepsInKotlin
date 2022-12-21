package com.google.kotlin2

fun main() {
    val a = test(5)
    val b = test(5, 5)
    println(a)
    println(b)
    test2(100)
}

fun test(a: Int, b: Int = 7) = a * b

fun test2(a: Int, b: Double = Math.PI) {
    println(a * b)
}