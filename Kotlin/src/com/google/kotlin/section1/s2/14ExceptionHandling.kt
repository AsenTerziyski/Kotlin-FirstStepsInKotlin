package com.google.kotlin.section1.s2

import java.lang.Exception

fun main() {
    val result = 8 / 2
    println(result)
    var exceptionMessage = "";

    try {
        var result2 = 8 / 7
        println(result2)

    } catch (e:Exception) {
        exceptionMessage = e.message.toString()
    } finally {
        println("Stopped!")
    }

    println(exceptionMessage)
}