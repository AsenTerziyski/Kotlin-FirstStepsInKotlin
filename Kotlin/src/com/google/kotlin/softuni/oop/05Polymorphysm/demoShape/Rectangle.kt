package com.google.kotlin.softuni.oop.`05Polymorphysm`.demoShape

class Rectangle(private var height: Double, private var width: Double) : Shape() {

    override var perimeter: Double = calculatePerimeter()
    override var area: Double = calculateArea()

    override fun calculateArea(): Double {
        this.perimeter = height * width
        if (this.perimeter <= 0.0) {
            throw Exception("Perimeter not calculated!")
        }
        return this.perimeter
    }

    override fun calculatePerimeter(): Double {
        this.area = 2 * (height + width)
        if (area <= 0.0) {
            throw Exception("Area not calculated!")
        }
        return this.area
    }
}