package com.google.kotlin.section2

fun main(args: Array<String>) {
    val resultInts = ints()
    val resultDoubles = doubles()
    val resultDoubleInt = doubleInt()
//    println(result.a as Int * result.b as Int)
    println(resultInts.a * resultInts.b)
    println(resultInts.a * resultInts.b)
    println("%.3f".format(resultDoubles.a + resultDoubles.b))
    println("%.1f".format(resultDoubleInt.a * resultDoubleInt.b))
}

//data class Tuple(val a: Any, val b: Any)

data class Tuple<T,R> (val a:T, val b:R)

fun ints() = Tuple(3, 2)
fun doubles() = Tuple(3.2, 2.1)
fun doubleInt() = Tuple(3, 2.1)