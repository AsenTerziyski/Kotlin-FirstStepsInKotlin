package com.google.kotlin.commons.classes

fun main() {
    val tvSet = TvSet("S305")
    tvSet.switchOn()
    tvSet.country = "Japan"
    tvSet.switchOn()
    tvSet.switchOff()
    tvSet.volumeUp()
    tvSet.volumeDown()
}

interface MyRemote {
    var producer: String
    var country: String
    fun switchOn()
    fun switchOff()
    fun volumeUp()
    fun volumeDown()
}

class TvSet(model: String, override var producer: String = "SONY", countryOfProduction: String? = null) : MyRemote {

    var model: String = model
        set(value) {
            if (value.isBlank()) {
                throw Exception("Model is empty!")
            }
            field = value
        }

    override var country = "Not specified"

    init {
        if (countryOfProduction != null) {
            this.country = countryOfProduction
        }
    }

    override fun switchOn() {
        println("${this.model} produced in $country IS SWITCHED ON")
    }

    override fun switchOff() {
        println("${this.model} produced in $country  IS SWITCHED OFF")
    }

    override fun volumeUp() {
        println("${this.model} produced in $country  VOLUME UP")
    }

    override fun volumeDown() {
        println("${this.model} produced in $country  VOLUME DOWN")
    }

}