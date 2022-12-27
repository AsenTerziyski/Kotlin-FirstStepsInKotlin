package com.google.kotlin3

fun main() {
    val list = intArrayOf(1, 2, 3)
    println(test(*list))
}

fun test(vararg ints: Int) = ints[0] + ints[1] + ints[2]