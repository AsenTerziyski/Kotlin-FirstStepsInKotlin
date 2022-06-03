package com.google.kotlin.commons.classes

fun main() {

    // empty class
    val empty = Empty()
    println(empty)

    //primary constructor
    val demoPrimaryCtr = DemoPrimaryCtr("Ivan", 10)
    println(demoPrimaryCtr.name)
    println(demoPrimaryCtr.number)
    demoPrimaryCtr.name = "John"
//    demoPrimaryCtr.number = 20
    println(demoPrimaryCtr.name)
    println(demoPrimaryCtr.number)

    println("Name: ${demoPrimaryCtr.name} - Number: ${demoPrimaryCtr.number} - is employed: ${demoPrimaryCtr.isEmployed}!")
    demoPrimaryCtr.isEmployed = false
    println("Name: ${demoPrimaryCtr.name} - Number: ${demoPrimaryCtr.number} - is employed: ${demoPrimaryCtr.isEmployed}!")


    val ford = Car("Ford")
    val mazda = Car("Mazda")
    val john = Person("John")
    try {
        john.getPersonCars()
    } catch (e: Exception) {
        println(e.message)
    }

    john.addCar(ford)
    john.addCar(mazda)

    john.cars.stream().forEach { println(it.model) }

    try {
        john.getPersonCars().forEach { car -> println(car.model) }
    } catch (e: Exception) {
        println(e.message)
    }

    var pets: MutableList<Pet> = mutableListOf()
    val person2 = Person2(pets)
    Pet("Cat", person2)
    Pet("Dog", person2)
    person2.pets.forEach { println(it.animal) }

    //secondary constructor
    val human = Human("John")
    val human1 = Human("Ugly boy Joe", human)
    val human2 = Human("Ugly kid Jos", human)
    human.children.stream().forEach{ println(it.name)}
    human.children.filter { it.name.contains("Jos") }.forEach{ println(lastWordOfKidsName(it))}

}

fun lastWordOfKidsName(it: Human): String {
    val split = it.name.split("\\s+".toRegex())
    return split[split.size - 1].toUpperCase()
}

class Empty

class DemoPrimaryCtr constructor(name: String, val number: Int, var isEmployed: Boolean = true) {

    var name: String = name
        set(value) {
            if (value.isBlank()) {
                throw Exception("Name should not be empty!")
            }

            if (value.length >= 3) {
                throw Exception("The name should be contain more than 3 symbols!")
            }
            field = value
        }

}

class Person(var name: String) {
    var cars: MutableList<Car> = mutableListOf()

    fun addCar(car: Car) {
        this.cars.add(car)
    }

    fun getPersonCars(): List<Car> {
        if (this.cars.size == 0) {
            throw Exception("Person does not own cars!")
        }
        return cars.toList()
    }
}

class Car(var model: String)

class Person2(val pets: MutableList<Pet> = mutableListOf())

class Pet(val animal: String, owner: Person2) {
    init {
        owner.pets.add(this)
    }
}

class Human(val name: String) {
    val children: MutableList<Human> = mutableListOf()

    constructor(name: String, parent: Human) : this(name) {
        parent.children.add(this)
    }
}
