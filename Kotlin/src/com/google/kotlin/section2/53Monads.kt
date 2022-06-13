package com.google.kotlin.section2

import java.lang.instrument.ClassFileTransformer
import java.util.*

fun main(args: Array<String>) {
    var list1 = listOf(1, 2, 3, 4, 5)
    println(list1)

    val map = list1.map { it -> 2 * it }
    println(map)

    var list2 = listOf(0, 1, 2, 3, 4, 5, 6, 7).flatMap { it -> listOf(it, it * 3) }
    println(list2)

    val testMap = Container(2).map { "...=>$it" }
    println(testMap)

    val testFlatMap = Container(3).flatMap { Container(it + 5) }
    println(testFlatMap)

    val opt = Optional.of(3)
    println(opt)

    val map1 = opt.map { it * 3 }
    println(map1)

    val flatMap = map1.flatMap { Optional.of(it + 4) }
    println(flatMap)

    // empty
    val empty = Optional.empty<Int>()
    println(empty)

    val emptyMap = empty.map { it * 3 }
    println(emptyMap)

    println(emptyMap.flatMap { Optional.of(it + 4) })
}

data class Container<T>(val obj: T) {
    fun <R> map(transformer: (T) -> R): Container<R> = Container(transformer(obj))
    fun <R> flatMap(transformer: (T) -> Container<R>) = transformer(obj)
}

