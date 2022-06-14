package com.google.kotlin.commons.collections

fun main(args: Array<String>) {
    var mutableList = mutableListOf<Int>()

    try {
        mutableList.add(2, 3)
        println(mutableList.joinToString(", "))
    } catch (e: Exception) {
        println(e.message)
    }

    mutableList.add(0)
    mutableList.add(1)
    mutableList.add(2)
    mutableList.add(3)
    mutableList.add(3)
    mutableList.add(3)
    mutableList.add(4)
    mutableList.add(5)
    mutableList.add(3)
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
    mutableList.add(9)
    mutableList.add(3)
    println(mutableList.joinToString(", "))

    var count = 0
    while (count <= mutableList.size - 1) {
        if (mutableList[count] == 3) {
            mutableList.removeAt(count)
        } else {
            count++
        }
    }
//    mutableList.removeIf { it == 3 }
    println(mutableList.joinToString(", "))
}