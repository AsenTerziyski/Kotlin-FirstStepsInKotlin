package com.google.kotlin.section2

fun main(args: Array<String>) {
    var global = 0
    fun first(x:Int) = global++ + 1
    fun second() = global * 2

    val first = first(1)
    val first1 = first(1)
    val second = second()
    val second1 = second()

    val first2 = first(3)
    val second2 = second()

    println(first2)
    println(second2)

}