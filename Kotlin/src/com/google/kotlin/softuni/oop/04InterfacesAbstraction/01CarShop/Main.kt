package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.`01CarShop`

fun main() {
    val ford = Ford("Red", "Fiesta", "Germany", 4)
    println(ford.takeInformation())
    println(ford.theColor())
    ford.theModel()

}

interface Car {
    val tires: Int
    fun theColor(): String
    fun theModel()
    fun theCountryOfProduction()
}

class Ford(color: String, model: String, country: String, override val tires: Int) : Car {
    private var color: String = color
        set(value) {
            if (color.isBlank()) {
                throw IllegalArgumentException("Color REQUIRED!")
            }
            field = value
        }
    private val model: String = model
    private val country: String = country

    override fun theColor(): String {
        return this.color
    }

    override fun theModel() {
        println(this.model)
    }

    override fun theCountryOfProduction() {
        println(this.country)
    }

    fun takeInformation(): String {
        return "Car information: ${this.color}, ${this.model}, ${this.tires}"
    }

}