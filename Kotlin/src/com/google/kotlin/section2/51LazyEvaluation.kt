package com.google.kotlin.section2

fun main(args: Array<String>) {
    println(something(4, "5", true))
    println(lazySomething({ arrayOf(1, 2) }, { arrayOf("3", "4") }, true).toString())

    val seq = generateSequence(0, { it.inc() })
    seq.take(10).forEach { print(" $it") }
}

fun something(a: Any, b: Any, isFirst: Boolean) = if (isFirst) a else b

fun lazySomething(a: () -> Any, b: () -> Any, isFirst: Boolean) = if (isFirst) a() else b()

