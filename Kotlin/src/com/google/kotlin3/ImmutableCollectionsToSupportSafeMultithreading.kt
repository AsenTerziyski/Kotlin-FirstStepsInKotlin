package com.google.kotlin3

import kotlin.concurrent.thread

val aMutableList = listOf<Int>(1, 2, 3)
val aMutableList2 = listOf<Int>(4, 5, 6, 7)
val aMutableList3 = mutableListOf<Double>(1.1, 2.2, 3.3)
val aMutableList4 = mutableListOf<Double>(1.7, 2.7, 3.7)

class StateObjects {
    var mutableList = aMutableList
    val readOnlyList = aMutableList3
}

fun main() {
    val stateObject = StateObjects()
    modifyList(stateObject) { println(stateObject.mutableList) }
    modifyReadOnlyList(stateObject) { println(stateObject.readOnlyList) }
}

fun modifyReadOnlyList(stateObjects: StateObjects, block: () -> Unit) {
    thread {
        for (i in stateObjects.readOnlyList.indices) {
            stateObjects.readOnlyList[i] = aMutableList4[i]
            block.invoke()
        }
    }
}

fun modifyList(stateObjects: StateObjects, block: () -> Unit) {
    thread {
        stateObjects.mutableList = aMutableList2
        block.invoke()
    }
}