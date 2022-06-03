package com.google.kotlin.softuni.oop.`05Polymorphysm`.exercise.pr01vehicles

fun main(args: Array<String>) {

    val vehicle = Vehicle(100.0, 1.0)
    vehicle.drive(50.0)
    println(vehicle.toString())
    vehicle.refuel(50.0)
    println(vehicle.toString())

    val car = Car("FORD FIESTA", 100.0, 1.0)
    car.drive(50.0)
    println(car.toString())


}