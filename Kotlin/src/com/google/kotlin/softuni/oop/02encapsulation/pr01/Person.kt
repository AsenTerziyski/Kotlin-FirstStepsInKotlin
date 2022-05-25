package com.google.kotlin.softuni.oop.`02encapsulation`.pr01

class Person(name: String, lastName: String, age: Int) {

    var name: String = name
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_NAME)
            }
            field = value
        }
    var lastName: String = lastName
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_NAME)
            }
            field = value
        }
    var age: Int = age
        set(value) {
            if (value <= 0) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_AGE)
            }
            field = value
        }


}