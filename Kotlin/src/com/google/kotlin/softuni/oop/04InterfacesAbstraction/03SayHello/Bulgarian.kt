package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.`03SayHello`

class Bulgarian(firstName: String, lastName: String, override val testValue: String) : Person {

    private var firstName: String = firstName
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException("Name is empty!")
            }
            field = value
        }

    private var lastName: String = lastName
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException("Name is empty!")
            }
            field = value
        }

    override fun takeName(): String {
        return "Full name: ${this.firstName} ${this.lastName}."
    }

    override fun sayHello(): String {
        return "Здрасти, г-н/г-жа ${this.lastName}. Твоята тест стойност е $testValue! "
    }
}