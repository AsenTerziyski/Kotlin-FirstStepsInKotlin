package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.`05BorderControl`

import java.util.*
import kotlin.random.asKotlinRandom

class Citizen(var firstName: String, var lastName: String, id: Int) : Identifiable {
    private val id: Int = id

    override fun scanId(): String {
        val random = (this.id..this.id * 10).random()
        val outputId = random * this.id
        return "WSEX${random}XXX${this.id}TXWE$outputId"
    }
}