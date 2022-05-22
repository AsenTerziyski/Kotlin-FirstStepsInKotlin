package com.google.kotlin.section1.s6

fun main() {

    var person = Person()

    // apply
    person.apply {
        name = "Ivan"
        age = 43
    }.startRun()

    println("${person.name} - ${person.age}")

    // with -> не мога както при apply да залепя стартРън():
    with(person) {
        name = "Peter"
        age = 41
    }

    println("${person.name} - ${person.age}")
    // трябва експлицитно да залепя стартРън()
    person.startRun()

}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("${this.name}, ${this.age} is ready to run....")
    }

}