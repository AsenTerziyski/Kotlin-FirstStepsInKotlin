package com.google.kotlin.section2

fun main() {
    val list = Cons("Hello", Cons("Functional", Cons("List", Nil)))
    println(list)

}

abstract sealed class LinkedList<out T : Any>

data class Cons<out T : Any>(val head: T, val tail: LinkedList<T>) : LinkedList<T>() {
    override fun toString(): String = "$head :: $tail"
}

object Nil: LinkedList<Nothing>() {
    override fun toString(): String = "Nil"
}

