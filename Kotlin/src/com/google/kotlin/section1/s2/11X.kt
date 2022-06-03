package com.google.kotlin.section1.s2

fun main() {

    Static()
    Static2()

    println("Start program!")
    var str: String = "This is test"

    isString(str)

    try {
        isString(1)
    } catch (e:Exception) {
        println(e.message)
    } finally {
        println("Program stopped!")
    }

    println("Program finished!")
}

class Static {
    companion object {
        lateinit var answer: String
        init {
            answer = "Static"
            println("Initialized $answer")
        }
    }
}

class Static2 {
    companion object {
        lateinit var answer: String
        init {
            answer = "Static2"
            println("Initialized $answer")
        }
    }
}

private fun isString(a: Any): Boolean {
    if (a is String) {
        println(a)
        return true
    }
    throw IllegalArgumentException("Input is not a String!")
}