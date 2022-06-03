package com.google.kotlin.section2

fun main(args: Array<String>) {

}

abstract sealed class LinkedList<out T : Any>

data class Cons<out T : Any>(val head: T, val tail: LinkedList<T>) : LinkedList<T>() {
    override fun toString(): String = "$head :: $tail"
}

object Nil : LinkedList<Nothing>() {
    override fun toString(): String = "Nil"
}

fun <T : Any> LinkedList<T>.forEach(f: (T) -> Unit): Unit = when (this) {
    Nil -> Unit
    is Cons -> {
        f(head)
        tail.forEach(f)
    }
}