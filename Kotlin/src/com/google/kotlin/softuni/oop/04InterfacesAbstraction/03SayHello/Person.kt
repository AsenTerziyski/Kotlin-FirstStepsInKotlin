package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.`03SayHello`

import java.io.Serializable

interface Person: Serializable {
    val testValue: String
    fun takeName(): String
    fun sayHello(): String {
        return "Hello"
    }

}