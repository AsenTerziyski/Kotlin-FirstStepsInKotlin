package com.google.kotlin.section2

fun main(args: Array<String>) {
    println(aFun("Test", "Test2"))

    val aLambda: (String, String) -> Int = { a,b -> aFun(a, b) }
    println(aLambda("A", "B"))

    val aLambda2 = ::aFun
    println(aLambda2("To", "Test"))

    arrayOf("Hello", "Asen", "Terziyski").map { it.length }.forEach(::print)

}

fun aFun(s1: String, s2: String): Int = s1.length + s2.length


