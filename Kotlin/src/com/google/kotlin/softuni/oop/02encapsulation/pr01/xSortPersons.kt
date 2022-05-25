package com.google.kotlin.softuni.oop.`02encapsulation`.pr01

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()

    val listOfPersons = LinkedList<Person>()

    for (i in 0 until n) {
        val input = scanner.nextLine().split("\\s+".toRegex())
        val person = Person(input[0], input[1], input[2].toInt())
        listOfPersons.add(person)
    }

    listOfPersons.sortWith(ComparePersons)
    listOfPersons.stream().forEach{ println("${it.name} ${it.lastName} is ${it.age} years old")}

}