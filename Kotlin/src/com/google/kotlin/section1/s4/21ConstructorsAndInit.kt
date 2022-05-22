//package com.google.kotlin.SECTION1.s4

fun main(args: Array<String>) {
    println("Hello owner!")

    var dog1 = Dog("German Shepherd", 40, "Black")
//    println("Your dog's breed is ${dog1.breed} with size ${dog1.size} and color: ${dog1.size}!")
    println("${dog1.characterstic}")
    dog1.run()
    dog1.bark()

    println()

    var dog2 = Dog("Pug", 10, "White")
//    dog2.breed = "Pug"
//    dog2.size = 10
//    dog2.color = "White"
    dog2.run()
    dog2.bark()

}

class Dog constructor(var breed:String, var size:Int, var color:String) {
//    var breed: String = ""
//    var size: Int = -1
//    var color: String = ""
    var characterstic: String = ""

    init {
//        this.breed = breed
//        this.size = size
//        this.color = color
        this.characterstic = "${this.breed}-${this.size}"
        println("Your dog's breed is ${this.breed}" +
                " with size ${this.size}" +
                " and color: ${this.size}!")
    }

    fun bark() {
        println("$breed barks: Wooh! Wooh")
    }

    fun run() {
        println("I am running!")
    }
}