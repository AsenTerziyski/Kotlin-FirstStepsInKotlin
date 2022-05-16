package com.google.kotlin.SECTION1.s7

fun main() {
    var namesList = mutableListOf<String>()
    namesList.add(0,"Ivan")
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
}