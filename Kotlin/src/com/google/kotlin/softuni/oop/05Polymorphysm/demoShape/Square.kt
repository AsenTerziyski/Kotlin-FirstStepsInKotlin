package com.google.kotlin.softuni.oop.`05Polymorphysm`.demoShape

class Square(a: Double) : Shape() {
    var a: Double = a
    override var perimeter: Double = calculatePerimeter()
    override var area: Double = calculateArea()


    override fun calculateArea(): Double {
        return a * a
    }

    override fun calculatePerimeter(): Double {
        return 4 * a

    }
}