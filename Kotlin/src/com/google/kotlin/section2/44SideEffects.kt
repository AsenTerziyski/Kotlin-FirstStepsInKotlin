package com.google.kotlin.section2

fun main(args: Array<String>) {
    var global = 0
    fun first(x:Int) = global++ + 1
    fun second() = global * 2

    // към global=0 ще добави 1 => first = 1, a global става 1 след това
    val first = first(1)
    // global вече е 1 - ще добави 1 => фирст1 ще е 2
    val first1 = first(1)

    val second = second()
    val second1 = second()

    // глобал = 2
    val first2 = first(3)
    val second2 = second()

    val first3 = first(0)
    println(first3)

    println(first2)
    println(second2)

}