package com.google.kotlin.softuni.oop.`02encapsulation`.pr01

class ComparePersons {
    //https://www.bezkoder.com/kotlin-sort-list-objects/
    companion object : Comparator<Person> {
        override fun compare(a: Person, b: Person): Int = when {
            a.name != b.name -> a.name.compareTo(b.name)
            a.lastName != b.lastName -> a.lastName.compareTo(b.lastName)
            else -> b.age - a.age
        }
    }
}