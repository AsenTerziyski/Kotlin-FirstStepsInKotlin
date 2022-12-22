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

    val test = Test()
    test.apply {
        test1 = "Test"
        test2 = 100
    }.test3()

}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("${this.name}, ${this.age} is ready to run....")
    }

}

class Test {
    var test1: String = ""
    var test2: Int? = null
    fun test3() = run { println(test1 + test2) }
}