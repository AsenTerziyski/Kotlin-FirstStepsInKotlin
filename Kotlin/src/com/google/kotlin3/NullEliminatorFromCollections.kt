package com.google.kotlin3

fun main() {
    val collection = arrayOf(1, 2, 3, null, 4, 5, null, 7)
    val notNulls = collection
        .filterNotNull()
        .forEach { println(it) }

    val listOfNotNull = listOfNotNull(collection).forEach(::print)
    val listOfNotNull2 = listOfNotNull(*collection)
    println(listOfNotNull2)
}