package com.google.kotlin.softuni.oop.`02encapsulation`.human

class Student(name: String, age: Int, school: String) : Person(name, age) {

    var school: String = school
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_SCHOOL_NAME)
            }
            field = value
        }

    override fun study() {
        println("$name, ID: $personId,  age $age is from school $school and he started studying!")
    }

    override fun toString(): String {
        return super.toString() + "is from $school!"
    }

    override fun eat() {
        println("Student $name eats!")
    }
}