package com.google.kotlin.section1.s2

fun main(args: Array<String>) {
    // if else
    val a = 2
    val b = 5

    var greaterNumber: Int

    if (a < b) {
        greaterNumber = b
    } else {
        greaterNumber = a
    }

    println(greaterNumber)

    var x = 2
    val y = 5

    if (x < y) {
        println(y)
    } else {
        println(x)
    }

    if (x < y) println(y) else println(y)

    var aa = 5
    var bb = 70

    var result = if (aa<bb) bb else aa
    println(result)

    result = if (aa<bb) {
        println("Greater number is:")
        println(bb)
        bb

    } else {
        println("Greater numner is:")
        println(aa)
        aa
    }

    println(result)
}