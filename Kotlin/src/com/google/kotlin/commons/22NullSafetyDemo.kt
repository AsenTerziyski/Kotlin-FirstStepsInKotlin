package com.google.kotlin.commons

fun main(args: Array<String>) {
    var name: String? = null
    println("Length: ${name?.length ?: "zero"}")

    name = "Tom"
    println("Length: ${name?.length ?: "zero"}")

    name = ""
    println("Length: ${name?.length}")

    name = null
    name?.let {
        println("${name?.length}")
    }

    name = "Test Name"
    name?.let {
        println("${name?.length}")
    }

    println("The length of name is ${name.length}")
    println("Name is $name")
}