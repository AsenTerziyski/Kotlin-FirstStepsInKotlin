package com.google.kotlin.commons

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val somethingOne = { "SomethingOne" }
    println(somethingOne.toString())
    println(somethingOne.invoke())

    val somethingTwo = { s: Any -> "SomethingTwo: $s" }
    println(somethingTwo)
    println(somethingTwo.invoke(2))
    println(somethingTwo.invoke("Two"))
    println(somethingTwo.invoke(true))
    println(somethingTwo.invoke('a'.toInt()))
    println(somethingTwo.invoke('a'))

    val somethingThree = { first: String, _: String -> println(first) }
    somethingThree.invoke("Three", "What")
    testMethod(1, somethingThree)

    val somethingFour = { first: Int, second: Int -> first + second }
    println("Result is: " + testMethodTwo(1, 2, somethingFour) + "!")
    println("Result is: " + testMethodTwo(100, 1, somethingFour) + "!")

    val somethingFive = { position: Int ->
        when (position) {
            1, 2, 3 -> "position is $position "
            4 -> "the position is high -> $position"
            5 -> "the position is too high -> $position"
            else -> throw Exception("Not valid position!")
        }
    }

    println(somethingFive(5))
    println(somethingFive(4))

    try {
        println(testMethodThree(7, somethingFive))
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println(testMethodThree(5, somethingFive))
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println(testMethodThree(3, somethingFive))
    } catch (e: Exception) {
        println(e.message)
    }

    val calculateGrade = fun(grade: Int): String {
        if (grade < 0 || grade > 100) {
            return "Error"
        } else if (grade < 40) {
            return "Fail"
        } else if (grade < 70) {
            return "Pass"
        }

        return "Distinction"
    }

    println(calculateGrade(30))
    println(calculateGrade(-30))
    println(calculateGrade(-65))
    println(calculateGrade(65))
    println(calculateGrade(75))

    val mySQRT = { a: Double ->
        if (a < 0.0) throw Exception("a should be greater than zero")
        if (a == 0.0) "Result is: %.2f".format(a)
        else "Result is: %.3f".format(sqrt(a))
    }

    println(mySQRT(2.3))

}

fun testMethodThree(position: Int, somethingFive: (Int) -> String): String {
    return somethingFive(position)
}

fun testMethodTwo(a: Int, b: Int, somethingFour: (Int, Int) -> Int): Int {
    return somethingFour(a, b)
}

fun testMethod(i: Int, somethingThree: (String, String) -> Unit) {
    somethingThree("A", "B")
    println(i)
}