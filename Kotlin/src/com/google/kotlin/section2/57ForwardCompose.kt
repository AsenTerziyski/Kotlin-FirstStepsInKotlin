package com.google.kotlin.section2

fun main() {

    val result = ::doubleString.andThen(::stringLength)
    println(result)
    println(result("abc"))

    val result2 = ::doubleString.andThen(String::length)
    println(result2)
    println(result2("abcde"))

    val result3 = ::doubleString.andThen(::stringLength).andThen(::triple)
    println(result3)
    println(result3("Hello"))

    val list = listOf("abc", "def", "ghi")
        .map(::doubleString)
        .map(::stringLength)
        .map(::triple)
    println(list)

    listOf("a", "ab", "abc")
        .map(::doubleString)
        .map(::stringLength)
        .map(::triple)
        .forEach { print("$it ") }
}

fun <T1, T2, R> ((T1) -> T2).andThen(f: (T2) -> R): (T1) -> R =
    { t1 -> f(this(t1)) }

fun doubleString(str: String) = str + str
fun stringLength(str: String): Int = str.length
fun triple(number: Int) = number * 3
