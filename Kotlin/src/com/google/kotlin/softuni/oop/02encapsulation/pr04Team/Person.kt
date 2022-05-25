package com.google.kotlin.softuni.oop.`02encapsulation`.pr04Team

class Person(name: String, age: Int) {
    var name: String = name
        set(value) {
            field = value
        }
    var age: Int = age
        set(value) {
            field = value
        }

}