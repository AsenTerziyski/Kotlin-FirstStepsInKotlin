package com.google.kotlin.section1.s7

fun main() {
    val myMap = mapOf<Int, String>(2 to "USA", 7 to "BG", 1 to "SWE")
    for (entry in myMap) {
        println(entry.value)
    }

    for (entry in myMap) {
        println(entry.key)
    }

    var myMutableMap = mutableMapOf<Int, String>()
    myMutableMap.putIfAbsent(1, "USA")
    myMutableMap[8] = "BG"
    myMutableMap.put(7, "SWE")
    myMutableMap.replace(2, "TEST")
    myMutableMap.replace(1, "TEST1")
    myMutableMap.putIfAbsent(1, "USA")
    myMutableMap.putIfAbsent(100, "USA")
    for (key in myMutableMap.keys) println(myMutableMap[key])

    for (entry in myMutableMap) {
        println("%d => %s".format(entry.key, entry.value))
    }

    val myStrMutableMap = mutableMapOf<String, String>()
    myStrMutableMap["One"] = "TEST ONE"
    myStrMutableMap["Two"] = "TEST TWO"
    myStrMutableMap.putIfAbsent("One", "TEST ONE ONE")
    myStrMutableMap.putIfAbsent("ONE", "TEST ONE ONE")

    myStrMutableMap.forEach { (key, value) -> println("%s --> %s".format(key, value)) }

}