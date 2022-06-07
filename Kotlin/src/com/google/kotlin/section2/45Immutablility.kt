package com.google.kotlin.section2

fun main(args: Array<String>) {
    val jon = Person("Jon", 30)
    val copy = jon.copy(age = 31)
    val copy2 = copy.copy(name = "Ivan")

    println(jon.toString())
    println(jon.hashCode())
    println(copy.toString())
    println(copy.hashCode())
    println(copy2.toString())
    println(copy2.hashCode())

}

data class Person(val name:String, val age:Int)