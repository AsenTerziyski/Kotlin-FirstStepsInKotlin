package com.google.kotlin.section2

fun main(args: Array<String>) {

    val testMyCurried = ::lengthSum.myCurried()
    println(testMyCurried)

    val test2MyCurried = testMyCurried("Test")
    println(test2MyCurried)

    val test3 = testMyCurried("TEST")("TEST1")
    println(test3)

    val test4 = testMyCurried.invoke("01234").invoke("56789")
    println(test4)
}

fun <T1, T2, R> ((T1, T2) -> R).myCurried(): (T1) -> (T2) -> R =
    { t1: T1 -> { t2: T2 -> this(t1, t2) } }

fun lengthSum(str1: String, str2: String): Int = str1.length + str2.length


