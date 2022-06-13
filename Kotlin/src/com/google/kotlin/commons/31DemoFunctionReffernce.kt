package com.google.kotlin.commons

fun main(args: Array<String>) {
    val aLambda = { a: String, b: String -> aTestFun(a, b) }
    println(aLambda("Test1", "Test2"))

    val aLambda2 = ::aTestFun
    println(aLambda("1", "2"))

    arrayOf("a", "bb", "ccc")
        .map { aTestFun1(it.length - 10) }
        .forEach(::println)

}

fun aTestFun(s1: String, s2: String): Int {
    return 2 * (s1.length + s2.length)
}

fun aTestFun1(n: Int): Int {
    return 2 * n
}