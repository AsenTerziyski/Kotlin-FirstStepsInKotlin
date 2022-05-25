package com.google.kotlin.softuni.oop.`03Inheritance`.exercises.pr01

class Child(name: String, age: Int) : Person(name, age) {
    override fun toString(): String {
        return "Child name is $name and its age is $age."
    }
}