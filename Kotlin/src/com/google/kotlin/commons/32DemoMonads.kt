package com.google.kotlin.commons

import java.util.*
import kotlin.math.absoluteValue


/*
https://arrow-kt.io/docs/patterns/monads/#:~:text=Kotlin%20has%20a%20notion%20of,continuations%20with%20Kotlin%20and%20Arrow.
 */
fun main() {

    val original = listOf(1, 2, 3)

    val list1 = original.map { 2 * it }
    println(list1.joinToString(","))

    val list2 = list1.flatMap { listOf(it, it * 2, it * 3) }
    println(list2.joinToString("-"))

    val myMap = MyContainer(3).myMap { it -> "---$it" }
    println(myMap.obj)
    val testObj = "TEST No3"
    val myFlatMap = MyContainer(testObj).myFlatMap { MyContainer("$it - !") }
    println(myFlatMap)
    println(myFlatMap.obj)

    val opt = Optional.of(3)
    println(opt.get())

    val map1 = opt.map { it -> "${it * 3} !" }
    println(map1.get())

    val flatMap2 = opt.flatMap { Optional.of(it*10) }
    println(flatMap2.get())

    val empty = Optional.empty<Int>()
    println(empty.isEmpty)
    val emptyMap = empty.map { it * 3 }
    try {
    println(emptyMap.get())
    } catch (e:Exception) {
        println(e.message)
    }

    try {
    println(emptyMap.flatMap { Optional.of(it + 4) }.get())
    } catch (e:Exception) {
        println(e.message)
    }

    val myTestMap = MyTestIntDataClass(10).myTestMap { it -> it + 10000.0 }
    println(myTestMap.testInput.format(2))

    val myTestFlatMap = MyTestIntDataClass(7500).myTestFlatMap { MyTestIntDataClass("%.3f".format(it/10.0)) }
    println(myTestFlatMap.testInput.replace(',', '.').toDouble().format(2))

}

data class MyContainer<T>(val obj: T) {
    //    може да се напише по два начина:
//    fun <R> myMap(transformer: (T) -> R): MyContainer<R> = MyContainer(transformer(obj))
    fun <R> myMap(transformer: (T) -> R): MyContainer<R> {
        return MyContainer(transformer(this.obj))
    }

    fun <R> myFlatMap(transformer: (T) -> MyContainer<R>) = transformer(obj)

}

data class MyTestIntDataClass<Int> (val testInput:Int) {
    fun<R> myTestMap(transformer: (Int) -> R) :MyTestIntDataClass<R> {
        return MyTestIntDataClass(transformer(this.testInput))
    }

    fun<R> myTestFlatMap(transformer: (Int) -> MyTestIntDataClass<R>) = transformer(testInput)


}

fun testMethodThreeX(position: Int, somethingFive: (Int) -> String): String {
    return somethingFive(position)
}


