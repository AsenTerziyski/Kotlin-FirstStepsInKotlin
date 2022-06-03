package com.google.kotlin.section1.s2

fun main() {
    val myTest = MyTest("MyName", 10)
    println()

    try {
        myTest.name = "TestName"
//        myTest.name = ""
        myTest.number = 5
        myTest.number = -1
    } catch (e: MyException) {
        println(e.message)
    } finally {
        println(myTest.name)
        println(myTest.number)
    }

    println()

}

class MyTest constructor(name: String, number: Int) {
    var number = number
        set(value) {
            if (value == -1) {
                throw MyException("Number should be positive or zero!")
            }
            field = value
        }
    var name = name
        set(value) {
            if (value.isBlank()) {
                throw MyException("Name should not be blank!")
            }
            field = value
        }

}

class MyException(s: String) : Exception(s) {
    override fun initCause(cause: Throwable?): Throwable {
        return super.initCause(cause)
    }
}
