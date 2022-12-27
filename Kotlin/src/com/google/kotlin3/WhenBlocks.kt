package com.google.kotlin3

import kotlin.math.pow

fun main() {
    val circle = Circle(10)
    val rectangle = Rectangle(10, 10)
    val square = Square(10)

    println(calcArea(circle))
    println(calcArea(rectangle))
    println(calcArea(square))

}

interface Figure
class Circle(val radius: Int) : Figure
class Rectangle(val a: Int, val b: Int) : Figure
class Square(val a: Int) : Figure

fun calcArea(figure: Figure) = when (figure) {
    is Circle -> {
        (figure.radius * 1.0).pow(2.0)
    }
    is Rectangle -> {
        figure.a * figure.b * 1.0
    }

    is Square -> {
        (figure.a * 1.0).pow(2.0)
    }

    else -> {
        throw Exception()
    }
}