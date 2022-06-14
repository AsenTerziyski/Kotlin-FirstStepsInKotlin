package com.google.kotlin.commons
import java.util.*
import kotlin.Comparator
fun main() {
    println("START.......")
    val listOfPersons = LinkedList<Person>()
//    for (i in 0 until n) {
//        val input = scanner.nextLine().split("\\s+".toRegex())
//        val person = Person(input[0], input[1], input[2].toInt())
//        listOfPersons.add(person)
//    }
    val person = Person()
    person.name = "A"
    person.lastName = "W"
    person.age = 15

    val person1 = Person()
    person1.name = "B"
    person1.lastName = "Z"
    person1.age = 155

    val person2 = Person()
    person2.name = "B"
    person2.lastName = "Z"
    person2.age = 25

    listOfPersons.add(person)
    listOfPersons.add(person1)
    listOfPersons.add(person2)

    listOfPersons
        .sortWith(ComparePersons)

    listOfPersons
        .stream()
        .forEach { println("${it.name} ${it.lastName} is ${it.age} years old") }

    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
//    listOfPersons.sortBy { p -> p.lastName }
//    listOfPersons.sortBy { p -> p.age }
//    listOfPersons.sortBy(Person::age)
//    listOfPersons.sortByDescending { p -> p.age }
//    listOfPersons.reverse()
    listOfPersons
        .stream()
        .forEach { println("${it.name} ${it.lastName} is ${it.age} years old") }
    println(".........END")
}


class Person() {
    var name: String = ""
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_NAME)
            }
            field = value
        }
    var lastName: String = ""
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_NAME)
            }
            field = value
        }
    var age: Int = -1
        set(value) {
            if (value <= 0) {
                throw IllegalArgumentException(ExceptionMessages.INVALID_AGE)
            }
            field = value
        }
}

class ComparePersons {
    //https://www.bezkoder.com/kotlin-sort-list-objects/
    companion object : Comparator<Person> {
        override fun compare(a: Person, b: Person): Int = when {
            a.name != b.name -> a.name.compareTo(b.name)
            a.lastName != b.lastName -> a.lastName.compareTo(b.lastName)
            else -> a.age - b.age
        }
    }
}

class ExceptionMessages {
    companion object {
        const val INVALID_AGE = "AGE CAN'T BE ZERO OR NEGATIVE"
        const val INVALID_NAME = "NAME CAN'T BE NULL OR EMPTY"
        const val INVALID_SCHOOL_NAME = "SCHOOL NAME CAN'T BE NULL OR EMPTY"
        const val INVALID_COMPANY_NAME = "COMPANY NAME CAN'T BE NULL OR EMPTY"
        const val INVALID_SALARY = "INVALID SALARY WHEN WORKERS AGE >= 50!"
        const val INVALID_SALARY_ZERO = "INVALID SALARY: CAN NOT BE NEGATIVE OR ZERO"

    }
}