package com.google.kotlin.softuni.oop.`02encapsulation`.human

abstract class Human {
    open var name: String = ""
    open var age: Int = -1

    open fun eat() {}
    open fun sleep() {}
    open fun work() {}
    open fun study() {}
}