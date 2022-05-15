package com.google.kotlin.SECTION1.s3

fun main(args: Array<String>) {
    val result = findVolume(10,150,10)
    println("The volume is $result.")
    val result2 = findVolume(10,15)
    println("The volume is $result2.")
}

fun findVolume(a: Int, b: Int, c: Int = 5): Int {
    return a*b*c
}
