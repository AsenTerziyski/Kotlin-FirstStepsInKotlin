package com.google.kotlin3

fun main() {
    var points: Int? = null
    val t = points?.let {
        println(doublePoints(it))
        println("Nothing happened!")
    } ?: -100

    println(t)

    points = 100
    points.let {
        val p = doublePoints(it)
        println(p)
    }
}

fun doublePoints(points: Int?) = points?.times(2)

