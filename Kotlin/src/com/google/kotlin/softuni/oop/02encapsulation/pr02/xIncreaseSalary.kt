package com.google.kotlin.softuni.oop.`02encapsulation`.pr02

fun main() {
    val person = Person("John", "Smith", 45, 1000.0)
    person.salary = 10000.0
    person.increaseSalary(25.0)
    println(person.toString())

    val person1 = Person("Peter", "Gabriel", 25, 2000.0)
    person1.increaseSalary(100.0)
    println(person1.toString())
}