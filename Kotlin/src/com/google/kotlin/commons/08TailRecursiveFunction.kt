package com.google.kotlin.commons

import java.lang.Exception
import java.math.BigDecimal
import java.math.BigInteger
import kotlin.math.pow

fun main(args: Array<String>) {
    //get nth number of Fibonacci Series
    // 1 1 2 3 5 8 13................nth
    try {
        println(getFibonacci(7, BigInteger("1"), BigInteger("0")))
    } catch (ex: Exception) {
        println(ex.message)
    }

    val bigDecimal = BigDecimal(2.0)
    println(bigDecimal.toDouble().pow(1000.0))
    println(10.0.pow(2))

}

tailrec fun getFibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n < 0) {
        throw Exception("n should be positive or zero!")
    }
    return if (n == 0) b
    else getFibonacci(n - 1, a + b, a)
}