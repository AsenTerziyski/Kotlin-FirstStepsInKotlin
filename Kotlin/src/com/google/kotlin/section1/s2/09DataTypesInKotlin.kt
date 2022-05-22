package com.google.kotlin.section1.s2

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    var name = "John"
    println(name)
    name = "Kevin"
    println(name)

    var age = 15
    println(age)

    var myAge: Int = 20
    println(myAge)

    var gender: Char = 'M'
    println(gender)

    var marks: Float = 200000000F
    println(marks)

    val marksTwo = 2.2f
    println(marksTwo)
//    marksTwo = 7F // Immutable
    println(marksTwo)

//    https://www.techiedelight.com/round-up-a-float-or-a-double-with-2-decimal-places-in-kotlin/
    val test = 125.21366555
    val df = DecimalFormat("#")
//    df.roundingMode = RoundingMode.DOWN
//    println(df.format(test))
    df.roundingMode = RoundingMode.FLOOR
    println(df.format(test))

    var exampleString = "Hello, Kotlin. You look better than Java :)"
    println(exampleString)
    println("The length of example string is $exampleString.length")
    //correct way
    println("The length of example string is ${exampleString.length}")

    // WAP to find rectangle area
    var recLength = 20.0
    var recWith = 10.00
    println("----- ${df.format(recLength * recWith)}")
    println(df.format(recLength * recWith))

}