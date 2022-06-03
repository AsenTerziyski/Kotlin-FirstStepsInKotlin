package com.google.kotlin.softuni.oop.`05Polymorphysm`.demoShape

fun main(args: Array<String>) {
    /*
    https://agrawalsuneet.github.io/blogs/backing-field-in-kotlin/
    How to use Backing field ?
Classes in Kotlin cannot have fields.
However, sometimes it is necessary to have a backing field when using custom accessors.
For these purposes, Kotlin provides an automatic backing field which can be accessed using the field identifier.
Replace the variable with the keyword field inside getter and setter

var selectedColor: Int = someDefaultValue
        get() = field
        set(value) {
            field = value
        }
     */
    val circle = Circle(10.0)
    println(circle.area)
    println(circle.perimeter)
    println(circle.calculateArea())
    println(circle.calculatePerimeter())

    val rectangle = Rectangle(10.0, 5.0)
    println("%.2fcm".format(rectangle.perimeter))
    println("%.3fcm2".format(rectangle.area))

    val square = Square(10.0)
    println(square.area)
    println(square.perimeter)

    println(add(1,2))
    println(add(10.0, 20.0, 30.0))
}

private fun add(a: Int, b: Int): Int {
    return a + b
}

private fun add(a: Double, b: Double, c: Double): Double {
    return a + b + c
}