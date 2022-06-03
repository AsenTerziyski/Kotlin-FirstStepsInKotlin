package com.google.kotlin.commons

fun main(args: Array<String>) {
    val test = Test("ABV", 105)

    println(test.name)
    println(test.number)
    println()

    test.name = "a"
    println(test.name)


}

class Test(name: String, number: Int) {
    var name: String = setName(name)
    var number: Int = setNumber(number)

    private fun setName(name: String): String {
        if (name.isBlank()) {
            println("xxxxxxxxxxxxxxxxxxxxx")
            throw Exception("XXXXXXXXXX!!!")
        }
        return name
    }

    private fun setNumber(number: Int): Int {
        if (number <= -100) {
            println("xxxxxxxxxxxxxxxxxxxxx")
            throw Exception(" Number should be greater than 100!")
        }
        return number
    }


}