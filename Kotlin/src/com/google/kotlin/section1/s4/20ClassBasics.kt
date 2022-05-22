package com.google.kotlin.section1.s4

fun main(args: Array<String>) {
    println("Hello owner!")

    var dog1 = Dog()
    dog1.breed = "German Shepherd"
    dog1.size = 40
    dog1.color = "Black"

    println("Your dog's breed is ${dog1.breed} with size ${dog1.size} and color: ${dog1.size}!")
    dog1.run()
    dog1.bark()

    println()

    var dog2 = Dog()
    dog2.breed = "Pug"
    dog2.size = 10
    dog2.color = "White"

    dog2.run()
    dog2.bark()

}

class Dog {
    var breed: String = ""
    var size: Int = -1
    var color: String = ""

    fun bark() {
        println("$breed barks: Wooh! Wooh")
    }

    fun run() {
        println("I am running!")
    }
}