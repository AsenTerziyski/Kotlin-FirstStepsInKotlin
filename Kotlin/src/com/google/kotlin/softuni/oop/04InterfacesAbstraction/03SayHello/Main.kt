package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.`03SayHello`

fun main(args: Array<String>) {
    val bulgarian = Bulgarian("Asen", "Terziyski", "My Test value")
    println(bulgarian.sayHello())
    println(bulgarian.takeName())
}