package com.google.kotlin.softuni.oop.`02encapsulation`.pr02

class Person(firstName: String, lastName: String, age: Int, salary: Double) {

    var firstName: String = firstName
        set(value) {
            if (value.isBlank() || value.length <= 3) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_NAME)
            }
            field = value
        }

    var lastName: String = lastName
        set(value) {
            if (value.isBlank() || value.length <= 3) {
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

    var salary: Double = salary
        set(value) {
            if (value <= 460) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_SALARY)
            }
            field = value
        }

    fun increaseSalary(bonus: Double) {
        if (bonus <= 0) {
            throw IllegalArgumentException(ExceptionMessages.INVALID_BONUS)
        }

        if (this.age <= 35) {
            this.salary = this.salary + 0.5 * bonus
        }

        if (this.age > 35) {
            this.salary = this.salary + bonus
        }

    }

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age, salary=$salary)"
    }


}