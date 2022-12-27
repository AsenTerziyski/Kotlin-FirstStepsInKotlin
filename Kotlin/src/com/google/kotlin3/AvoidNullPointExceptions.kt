package com.google.kotlin3

fun main() {
    var number: String? = null
    println(checkNumber(number))
    val total: Any = 123456
    val runs = (total as? Run)?.runs ?: Run(1000).runs
    println(runs)

}

interface Scores
class Run(val runs: Int) : Scores

fun checkNumber(number: String?) = number ?: "N/A"