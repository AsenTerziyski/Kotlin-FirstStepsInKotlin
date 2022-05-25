package com.google.kotlin.softuni.oop.`04InterfacesAbstraction`.exercises.`05SmartPhone`

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputNumbers = scanner.nextLine().split("\\s+".toRegex())
    val inputUrls = scanner.nextLine().split("\\s+".toRegex())

    val smartPhone = SmartPhone(inputNumbers, inputUrls)
    println(smartPhone.call())
    println(smartPhone.browse())
}