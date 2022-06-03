package com.google.kotlin.softuni.oop.`05Polymorphysm`.exercise.pr01vehicles

import kotlin.reflect.KClass

open class Vehicle(fuelQuantity: Double, fuelConsumption: Double) : IVehicle {
    var fuelQuantity: Double = fuelQuantity(fuelQuantity)

    private fun fuelQuantity(fuelQuantity: Double): Double {
        if (fuelQuantity <= 0.0) {
            throw IllegalArgumentException("Fuel can`t be zero or negative!")
        }
        return fuelQuantity
    }
    var fuelConsumption: Double = fuelConsumption(fuelConsumption)

    private fun fuelConsumption(fuelConsumption: Double) : Double {
        if (fuelConsumption <= 0.0) {
            throw IllegalArgumentException("Fuel consumption can`t be zero or negative!")
        }
        return fuelConsumption
    }


    override fun drive(distance: Double): String {
        val fuelNeeded = distance * fuelConsumption
        var output = "needs refueling"

        if (this.fuelQuantity >= fuelNeeded) {
            this.fuelQuantity = this.fuelQuantity - fuelNeeded

            output = "travelled %s km".format(distance)
        }

        return output
    }

    override fun refuel(litters: Double) {
        fuelQuantity += litters
    }

    private fun Vehicle.getClass(): KClass<Vehicle> {
        return javaClass.kotlin
    }

    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return "%s: %.2f".format(className, fuelQuantity )
    }


}