package com.google.kotlin.softuni.oop.`05Polymorphysm`.demoShape

class Circle(rad: Double) : Shape() {
    var radius: Double = rad

    override var perimeter: Double = calculatePerimeter()
    override var area: Double = calculateArea()

    override fun calculateArea(): Double {
        this.area = Math.PI * Math.pow(this.radius, 2.0)
        return this.area
    }

    override fun calculatePerimeter(): Double {
        this.perimeter = 2 * Math.PI * radius
        return this.perimeter
    }


}