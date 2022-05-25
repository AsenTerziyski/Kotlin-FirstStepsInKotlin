package com.google.kotlin.softuni.oop.`03Inheritance`.exercises.pr04

fun main() {
    val vehicle = Vehicle(100.0, 1.5)
    vehicle.drive(10.0)
    val fuel = vehicle.fuel
    println(fuel)

    val car = Car(200.0, 20.0)
    car.drive(20.0)
    println(car.fuel)
    println(car.toString())
}