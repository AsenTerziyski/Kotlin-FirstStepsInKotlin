package com.google.kotlin.softuni.oop.`03Inheritance`.exercises.pr04

open class Vehicle(fuel: Double, fuelConsumption: Double) {
    val DEFAULT_FUEL_CONSUMPTION = 1.25

    var fuel = fuel
        set(value) {
            field = value
        }

    private var fuelConsumption = fuelConsumption
        set(value) {
            if (fuelConsumption == 0.0) {
                field = DEFAULT_FUEL_CONSUMPTION
            }
            field = value
        }

    open fun drive(km: Double) {
        var remainingFuel = this.fuel - km * fuelConsumption
        if (remainingFuel>=0) {
            this.fuel = remainingFuel
        } else {
            println("Stopped!")
            this.fuel = 0.0
        }
    }
}