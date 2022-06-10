package com.google.kotlin.section2

fun main(args: Array<String>) {
    val something = {"Something....."}

    println(something.toString())
    println(something())
    println(something.invoke())

    val arg1 = {s:String -> s}
    println(arg1("Hello, Kotlin."))
    println(arg1.invoke("Hello, Kotlin its me again..."))

    val arg2 = {s:String, _:String -> s}
    println(arg2("a", "b"))
    println(arg2.toString())

}