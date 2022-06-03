package com.google.kotlin.section1.s6

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //write a prigram tha receives a string and reverses it:
    // hello - > olleh
    // test reversed()
    val testString = "Hello, Kotlin!"
    println(testString.reversed())

    val lambda: (String) -> String = { str: String -> str.reversed() }
    reverseString("hello", lambda)
    reverseString("Hello again") { it.reversed() }


}

fun reverseString(input: String, myFunc: (String) -> String) {
    println(myFunc(input))
}

