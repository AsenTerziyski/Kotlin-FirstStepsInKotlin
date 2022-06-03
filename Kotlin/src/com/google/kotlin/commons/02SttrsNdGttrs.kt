package com.google.kotlin.commons

fun main() {

    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria: pretended age = ${maria.age}")

    val testGirl = GirlTest(15)
    testGirl.actualAge = 15

    println("TestGirl: actual age = ${testGirl.actualAge}")
    println("TestGirl: pretended age = ${testGirl.age}")


    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")
}

class Girl {
    var age: Int = 0
        //        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value in 18..30)
                value
            else
                value - 3
        }

    var actualAge: Int = 0
}

// При TestGirl логиката на сетъра няма да работи както при Girl
class GirlTest(age: Int) {
    var age: Int = age
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value in 18..30)
                value
            else
                value - 3
        }

    var actualAge: Int = 0
}

