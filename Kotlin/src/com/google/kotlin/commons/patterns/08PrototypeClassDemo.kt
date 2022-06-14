package com.google.kotlin.commons.patterns

import com.google.kotlin.section2.sumTwo

//https://codkiller0911.medium.com/creational-design-pattern-in-kotlin-prototype-pattern-8104d622a01
fun main() {
    val basicBike = Bike()
    val b1 = basicBike.clone()
    val b2 = basicBike.clone()

    println(b1)
    println(b2)

    b1.gears = 7
    println(b1)
    println(b1.gears)
}

class Bike : Cloneable {

    var gears: Int = 0
        set(value) {
            if (value == 0) {
                throw Exception("Gears should be greater than zero!")
            }
            field = value
        }
    private var bikeType: String? = null
    var model: String? = null

    init {
        bikeType = "Standart"
        model = "BMX"
        gears = 4
    }

    public override fun clone(): Bike {
        return Bike()
    }
}