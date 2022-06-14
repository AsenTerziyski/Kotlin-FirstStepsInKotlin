package com.google.kotlin.commons

fun main(args: Array<String>) {
    val resultTest = test()
    val testTuple = TestTuple(1, 2)
    println(testTuple.a * testTuple.b)
    println("%.5f".format(resultTest.a*resultTest.b))
    val d = TestTuple(3.0, 2.0)
    println("%.3f".format((d.a*d.b)))
    val doubles = doubles()
    println(doubles.a*doubles.b)
    println(ints().a + ints().b)
}

data class TestTuple<F,S> (var a:F, var b:S)

fun test() = TestTuple(3,5.5)
fun ints() = TestTuple(1,2)
fun doubles() = TestTuple(1.0,2.0)