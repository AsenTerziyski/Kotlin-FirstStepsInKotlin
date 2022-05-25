package com.google.kotlin.softuni.oop.`02encapsulation`.human

open class Person: Human {

    // https://discuss.kotlinlang.org/t/suggestion-static-local-variables/18386
    object Count {
        private var count: Int = 0
        operator fun invoke() = ++count
    }

     override var name: String = ""
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_NAME)
            }
            field = value
        }

    override var age: Int = 0
        set(value) {
            if (value <= 10) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_AGE)
            }
            field = value
        }

    var personId: String = ""

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        personId = "${Count.invoke()}xx$name"
    }


}