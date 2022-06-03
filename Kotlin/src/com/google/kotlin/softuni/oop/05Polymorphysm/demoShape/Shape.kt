package com.google.kotlin.softuni.oop.`05Polymorphysm`.demoShape

abstract class Shape {
    abstract var perimeter:Double
    abstract var area:Double

    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

}