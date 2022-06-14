package com.google.kotlin.commons
import kotlin.reflect.KClass

fun main(args: Array<String>) {
    val car = Car()
    println(car.toString())
    val truck = Truck()
    println(truck.toString())
}

class Car {
    private fun Car.getClass(): KClass<Car> {
        return javaClass.kotlin
    }
    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return className.toUpperCase()
    }
}

class Truck {
    private fun Truck.getClass(): KClass<Truck> {
        return javaClass.kotlin
    }
    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return className.toUpperCase()
    }
}