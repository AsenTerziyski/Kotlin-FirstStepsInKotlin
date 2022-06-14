package com.google.kotlin.commons.collections

fun main() {
    val countries = mapOf<Int, String>(1 to "USA", 20 to "BG", 3 to "SWE")
    for (country in countries) {
        if (country.key <= 9) {
            println("0%d -> %s".format(country.key, country.value))
        } else {
            println("%d -> %s".format(country.key, country.value))
        }
    }

    val countriesTwo = mutableMapOf<Int, String>(1 to "USA", 20 to "BG", 3 to "SWE", 4 to "USSR")
    println(countriesTwo.putIfAbsent(3, "TEST"))
    println(countriesTwo.putIfAbsent(10, "TEST"))
    println()
    countriesTwo.replace(4, "Russia")

    for (country in countriesTwo) {
        if (country.key <= 9) {
            println("0%d -> %s".format(country.key, country.value))
        } else {
            println("%d -> %s".format(country.key, country.value))
        }
    }

    for (value in countriesTwo.values) {
        println(value)
    }

    for (key in countries.keys) {
        if (key <= 9) {
            println("0%d".format(key))
        } else {
            println("%d".format(key))
        }
    }
}