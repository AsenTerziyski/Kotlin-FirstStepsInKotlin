package com.google.kotlin.section1.s7

fun main() {

    val nameList = listOf<String>("Ivan", "Peter", "Axl")

    for (name in nameList) {
        println(name)
    }

    nameList.forEach {
        println(it)
    }

}