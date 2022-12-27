package com.google.kotlin3

fun main() {
    val test = "BG - TEST - TEST2"
    with(test) {
        println(substring(0,2))
        println(substring(3,7))
        println(substring(7,10))
        println(length)
    }
}