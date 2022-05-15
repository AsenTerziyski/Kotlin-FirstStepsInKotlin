package com.google.kotlin.SECTION1.s4

fun main() {
    var dog = MyDog()
    dog.breed = "Dog"
    dog.color = "Black"
    dog.eat()
    dog.bark()

    var cat = Cat()
    cat.age = 5
    cat.color = "White"
    cat.eat()
    cat.meow()

    var animal = Animal()
    animal.color = "Black"
    animal.eat()

}

open class Animal {
    var color: String = ""
    fun eat () {
        println("${this.color} - Am, amm")
    }

}

class MyDog:Animal() {
    var breed: String = ""
//    var color: String = ""

    fun bark () {
        println("${this.breed} Bau, bau...")
    }

//    fun eat () {
//        println("Am, amm")
//    }
}

class Cat: Animal() {
    var age:Int = -1
//    var color:String = ""

    fun meow () {
        println("Myauuu, myauuu...")
    }

//    fun eat () {
//        println("Am, amm")
//    }
}