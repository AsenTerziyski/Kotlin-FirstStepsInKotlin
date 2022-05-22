package com.google.kotlin.section2

fun main(args: Array<String>) {

    println(price(100.0, 0.2, 10.0))
    println(price100(0.2, 10.0))

    // with partial:
    val testPrice = ::price.partial1(100.0)
    println(testPrice(0.2, 10.0))

}

// R stands for result
fun <T1, T2, T3, R> ((T1, T2, T3) -> R).partial1(t1: T1): (T2, T3) -> R =
    { t2, t3 -> this.invoke(t1, t2, t3) }

fun price(original: Double, pDiscount: Double, fDiscaunt: Double) =
    original * (1 - pDiscount) - fDiscaunt

fun price100(pDiscount: Double, fDiscaunt: Double) =
    price(100.0, pDiscount, fDiscaunt)