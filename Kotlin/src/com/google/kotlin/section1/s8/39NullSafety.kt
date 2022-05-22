package com.google.kotlin.section1.s8

fun main() {
    var name:String? = null
    println("The length of name is ${name?.length}")
    name = ""
    println("The length of name is ${name.length}")
    name = "Peter"
    println("The length of name is ${name.length}")

    name = null
    name?.let {
        println("The length of name is ${name?.length}")
    }

    name = "Ivan"
    name?.let {
        println("The length of name is $name")
    }

    name = null
    name?.let {
        println("The length of name is $name")
    }

    name = "Axl Rose"
    println("The length of name is ${name!!.length}")
    println("Name is ${name!!}")

    name = null
//    try {
//        println("The length of name is ${name!!.length}")
//        println("Name is ${name!!}")
//    } catch (e:Exception) {
//        println("Name is: " + e.message + "!")
//    }

}