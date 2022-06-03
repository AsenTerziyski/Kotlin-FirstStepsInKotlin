package com.google.kotlin.softuni.oop.`05Polymorphysm`.exercise.pr01vehicles

import kotlin.reflect.KClass

class Car(
    var model: String,
    fuelQuantity: Double,
    fuelConsumption: Double
) : Vehicle(fuelQuantity, fuelConsumption) {

    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return "%s %s -> %.2f".format(className.toUpperCase(),model, fuelQuantity )
    }

    private fun Car.getClass(): KClass<Car> {
        return javaClass.kotlin
    }
}