package com.google.kotlin.commons

fun main() {
    val aa = "T"
    println(check(aa))
    val bb = 7
    println(check(bb))
}

fun check(a: Any): Boolean {
    if (a is String) {
        println(a)
        return true
    }
    println("a-> $a is not string!")
    return false
}