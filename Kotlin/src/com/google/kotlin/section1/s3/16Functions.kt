package com.google.kotlin.section1.s3

fun main(args: Array<String>) {
    println(add(3, 2))
    println(add(10, 15))


    var result = add(7, 7)
    printTheResult(result)
    printTheResult(add(100,100))
    printTheResult(add(100,1000))
}

fun printTheResult(result: Int) {
    println("The result is $result!")
}

fun add(first: Int, second: Int): Int {
    return first + second
}