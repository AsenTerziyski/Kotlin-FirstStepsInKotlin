package com.google.kotlin.section1.s7

import com.google.kotlin.section1.s3.add

fun main() {
    var namesList = mutableListOf<String>()
    namesList.add(0, "Ivan")
    namesList.add(1, "John")
    namesList.add("Test")
    namesList.add("Test")
    namesList.add("Test")
    namesList.add("Test")
    namesList.remove("Test")
    namesList.removeAt(4)
    namesList[2] = "Maria"

    for (name in namesList) {
        println(name)
    }

    val list = mutableListOf<String>()

    for (s in namesList) {
        list.add("$s!")
    }
    list.forEach {
        println(it)
    }

    list.reversed().forEach {
        println(it)
    }

    val modified = list.filter { it != "Maria!" }.reversed().forEach { println(it) }

    list
        .filter { it.startsWith("M") }
        .forEach { if (it.contains("r")) println(it) }
}