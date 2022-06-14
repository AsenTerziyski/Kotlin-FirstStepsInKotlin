package com.google.kotlin.commons

fun main(args: Array<String>) {

    val nameList = listOf<String>("Axl", "Ivan", "Peter", "Axl", "Slash")
    println(nameList.lastIndexOf("Axl"))
    println(nameList.find { s -> s == "Axl" })
    println(nameList.size)
    println(nameList.subList(1, 4).joinToString(", "))

    val numbers = listOf<Int>(0, 1, 2, 1)
    println(numbers.find { n -> n == 1 })
}

