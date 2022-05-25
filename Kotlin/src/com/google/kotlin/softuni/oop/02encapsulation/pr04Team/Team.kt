package com.google.kotlin.softuni.oop.`02encapsulation`.pr04Team

import java.util.*

class Team(name: String) {

    var name: String = name
        set(value) {
            field = value
        }

    var firstTeam: MutableList<Person> = mutableListOf<Person>()
    var reserveTeam: MutableList<Person> = mutableListOf<Person>()


    fun getFrstTeam(): List<Person> {
        return Collections.unmodifiableList(this.firstTeam)
    }

    fun getRsrvTeam(): List<Person> {
        return Collections.unmodifiableList(reserveTeam)
    }

    fun addPlayer(person: Person) {
        if (person.age <= 40) {
            firstTeam.add(person)
        } else {
            reserveTeam.add(person)
        }
    }


}