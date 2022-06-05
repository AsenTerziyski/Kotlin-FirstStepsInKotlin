package com.google.kotlin.commons.collections

fun main(args: Array<String>) {
    val strSet = setOf<String>("Test0", "Test0", "Test", "Test1", "Test2", "Test3", "Test1")
    println(strSet.joinToString(", "))

    val sorted = strSet.sorted()
    println(sorted.joinToString(", "))

    val mutableStrSet = mutableSetOf<String>("Test0", "Test0", "Test", "Test1", "Test2", "Test3", "Test1")
    mutableStrSet.add("Test4")
    mutableStrSet.add("Test1")
    println(mutableStrSet.joinToString("->"))

    val removed = mutableStrSet.remove("Test4")
    println(removed)

    mutableStrSet.add("a")
    mutableStrSet.add("ab")
    mutableStrSet.add("abc")
    println(mutableStrSet.joinToString("->"))
    mutableStrSet.removeIf { it.length <= 3 }
    println(mutableStrSet.joinToString("->>>>"))

    mutableStrSet.add("a")
    mutableStrSet.add("ab")
    mutableStrSet.add("abc")
    mutableStrSet.add("abcd")

    mutableStrSet.removeIf { str -> str.length % 2 != 0 }
    println(mutableStrSet.joinToString("->>>>"))

    mutableStrSet.add("a")
    mutableStrSet.add("ab")
    mutableStrSet.add("abc")
    mutableStrSet.add("abcd")
    mutableStrSet.removeIf { it.length == 4 }

    mutableStrSet.sortedDescending()
    println(mutableStrSet.joinToString("->>>>"))
}