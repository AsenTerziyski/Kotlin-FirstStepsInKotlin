package com.google.kotlin.commons.classes

import com.google.kotlin.commons.Car
import kotlin.math.E
import kotlin.reflect.KClass

fun main(args: Array<String>) {

    val myAnimal = MyAnimal("Animal")
    myAnimal.eat()
    myAnimal.color = "RED"
    myAnimal.eat()

    val myCat = MyCat("Tom", "Siam")
    myCat.color = "Gray".toUpperCase()
    myCat.myauu()
    myCat.eat()

    try {
        myCat.breed = "Sia"
    } catch (e: Exception) {
        println(e.message)
    }

}

open class MyAnimal(name: String, var color: String? = null) {

    var name: String = name
        set(value) {
            if (value.isBlank()) {
                throw Exception("Name should not be empty!")
            }
            field = value
        }

    fun eat() {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        println("%s with color %s eats...".format(className.substring(2), this.color))
    }


    private fun MyAnimal.getClass(): KClass<MyAnimal> {
        return javaClass.kotlin
    }

    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return className.toUpperCase()
    }
}

class MyCat(name: String, breed: String) : MyAnimal(name) {

    var breed: String = breed
        set(value) {
            if (value.isBlank()) {
                throw Exception("Breed should not be empty!")
            }

            if (value.length <= 3) {
                throw Exception("Breed length should be greater than 3!")
            }
            field = value
        }


    fun myauu() {
        val split = this.javaClass.kotlin.toString().split("\\.".toRegex())
        val cat = split[split.size - 1].substring(2)
        println(
            "%s %s breed %s color %s says muwwoooo....!!!".format(
                cat,
                this.name,
                this.breed,
                this.color
            )
        )
    }
}

