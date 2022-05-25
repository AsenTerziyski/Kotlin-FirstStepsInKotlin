package com.google.kotlin.softuni.oop.`03Inheritance`.exercises.pr04


import kotlin.reflect.KClass

class Car(fuel:Double, fuelConsumption:Double):Vehicle(fuel, fuelConsumption) {

    fun<T: Car> T.getClass(): KClass<T> {
        return javaClass.kotlin
    }

    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return "Car class is $className"
    }
}