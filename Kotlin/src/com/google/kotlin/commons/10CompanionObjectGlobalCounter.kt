package com.google.kotlin.commons

import kotlin.math.abs
import kotlin.random.Random

fun main() {
    val student1 = Student("Ivan", 10)
    println(student1.instanceCounter)

    val student2 = Student("John", 15)
    println(student2.instanceCounter)

    val student3 = Student("Peter", 25)
    println(student3.instanceCounter)

    println(student1.stringId)
    println(student2.stringId)
    println(student3.stringId)

}

class Student(name: String, number: Int) {
    var name = name
        set(value) {
            if (name.isBlank()) {
                throw Exception("Name should not be blank!")
            }
            field = value
        }
    var number = number
    var instanceCounter = getThisId()
    var stringId: String = "St${instanceCounter}X" + "R"+ abs(Random(instanceCounter).nextInt()) + "SSE";

    companion object {
        var ID = 0
        fun getThisId(): Int {
            return ++ID
        }
    }


}

