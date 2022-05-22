package com.google.kotlin.section2

fun main(args: Array<String>) {
    val jon = Person("Jon", 30)
    val copy = jon.copy(age = 31)

    println(jon.toString())
    println(copy.toString())

}

data class Person(val name:String, val age:Int)