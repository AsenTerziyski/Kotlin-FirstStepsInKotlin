package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.`05BorderControl`

fun main(args: Array<String>) {
    val citizen = Citizen("John", "Smith", 20)
    val scanId = citizen.scanId()
    println(scanId)
}