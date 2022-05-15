package com.google.kotlin.SECTION1.s3

import java.lang.Exception
import java.math.BigInteger

fun main(args: Array<String>) {

    //get nth number of Fibonacci Series
    // 1 1 2 3 5 8 13................nth
    try {
    println(getFibonacci(6, BigInteger("1"), BigInteger("0")))
    } catch (ex:Exception) {
        println(ex.message)
    }

}

tailrec fun getFibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n < 0) {
        throw Exception("n should be positive or zero!")
    }

    if (n == 0)
        return b
    else
        return getFibonacci(n - 1, a + b, a)

}